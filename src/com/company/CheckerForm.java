package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                ImageIcon imageIcon = new ImageIcon(
                        new ImageIcon("src/origUnresized.png")
                                .getImage()
                                .getScaledInstance(16, 16, Image.SCALE_DEFAULT)
                );
                responseLabel.setIcon(imageIcon);
            }
        });


    }
}
