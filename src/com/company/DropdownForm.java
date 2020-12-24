package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownForm extends JFrame {
    private JComboBox<Cat> comboBox1;
    private JLabel visualizationLabel;
    private JPanel mainPanel;

    public DropdownForm() {
        setSize(660, 600);
        setContentPane(mainPanel);

        Cat[] cats = new Cat[]{
                new Cat("Аманта"),
                new Cat("Арабелла"),
                new Cat("Ахия")
        };
        for (Cat cat : cats) {
            comboBox1.addItem(cat);
        }

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizationLabel.setText(((Cat) comboBox1.getSelectedItem()).getName());
            }
        });
    }
}
