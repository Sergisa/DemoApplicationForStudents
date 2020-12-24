package com.company;

import com.company.catComboBox.CatComboBox;
import com.company.catComboBox.CatItemRenderer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DropdownForm extends JFrame {
    private JLabel visualizationLabel;
    private JPanel mainPanel;
    private CatComboBox catComboBox1;

    public DropdownForm() {
        setSize(660, 600);
        setContentPane(mainPanel);
        catComboBox1.setRenderer(new CatItemRenderer());
        Cat[] cats = new Cat[]{
                new Cat("Аманта", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_013.png"),
                new Cat("Арабелла", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_022.png"),
                new Cat("Ахия", "https://vkclub.su/_data/stickers/nypersik/sticker_vk_nypersik_008.png")
        };
        catComboBox1.addItems(cats);

        catComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                visualizationLabel.setText(((Cat) catComboBox1.getSelectedItem()).getName());
            }
        });
    }

    private void createUIComponents() {
        catComboBox1 = new CatComboBox();
        catComboBox1.setEditable(true);
        // TODO: place custom component creation code here
    }
}
