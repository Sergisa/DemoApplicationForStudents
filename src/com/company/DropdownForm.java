package com.company;

import com.company.catComboBox.CatItemRenderer;

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
        comboBox1.setRenderer(new CatItemRenderer());
        Cat[] cats = new Cat[]{
                new Cat("Аманта", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_013.png"),
                new Cat("Арабелла", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_022.png"),
                new Cat("Ахия", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_008.png")
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
