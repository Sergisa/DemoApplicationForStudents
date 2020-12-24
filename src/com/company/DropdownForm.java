package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownForm extends JFrame {
    private JComboBox comboBox1;
    private JLabel visualizationLabel;
    private JPanel mainPanel;

    public DropdownForm() {
        setSize(600, 200);
        setContentPane(mainPanel);

        String[] catNames = new String[]{
                "Аманта",
                "Арабелла",
                "Ахия"
        };

        Cat[] cats = new Cat[]{
                new Cat("Аманта"),
                new Cat("Арабелла"),
                new Cat("Ахия")
        };

        for (String cat : catNames) {
            comboBox1.addItem(cat);
        }

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizationLabel.setText(cats[comboBox1.getSelectedIndex()].toString());
            }
        });
    }
}
