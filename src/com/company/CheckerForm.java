package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckerForm extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;
    private JLabel responseLabel;

    public CheckerForm() {
        setContentPane(panel1);
        setSize(300, 300);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ^\d{4} \d{4} \d{4} (\d{4}|\d{6})$
                // \w+@\w+\.(ru|com|net|ua|org)
                // ([+]?[78]\([\d]{3}\)[0-9]{3}-[0-9]{2}-[0-9]{2})
                // \d{1,2}[:-]\d{1,2}[:-]\d{1,2}
                // (\w+)@\w+\.(ru|com|net|ua|org)
                Pattern emailPattern = Pattern.compile("(\\w+)@\\w+\\.(ru|com|net|ua|org)");
                Matcher emailPatternMatcher = emailPattern.matcher(textField1.getText());
                if (emailPatternMatcher.find()) {

                    /*ImageIcon imageIcon = new ImageIcon(
                        new ImageIcon("src/origUnresized.png")
                                .getImage()
                                .getScaledInstance(16, 16, Image.SCALE_DEFAULT)
                    );*/
                    responseLabel.setIcon(new ImageIcon("src/origUnresized.png"));
                    System.out.println("account name: " + emailPatternMatcher.group(1));
                    System.out.println("domain name: " + emailPatternMatcher.group(2));
                    System.out.println("good");
                } else {
                    responseLabel.setIcon(new ImageIcon("src/origUnresized.png"));
                    System.out.println("bad");
                }
            }
        });


    }
}
