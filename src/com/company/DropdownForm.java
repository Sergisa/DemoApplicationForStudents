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

        String[] elementsToChoose = new String[]{
                "Giraffe",
                "Hedgehog",
                "Cat",
                "Dog",
                "Elephant"
        };
        for (String element : elementsToChoose) {
            comboBox1.addItem(element);
        }

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox1.getSelectedIndex();
                System.out.println(elementsToChoose[selectedIndex]);
            }
        });
    }
}
