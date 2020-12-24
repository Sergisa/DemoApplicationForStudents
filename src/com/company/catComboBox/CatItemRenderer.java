package com.company.catComboBox;

import com.company.Cat;

import javax.swing.*;
import java.awt.*;

public class CatItemRenderer extends JPanel implements ListCellRenderer<Cat> {
    private JLabel labelItem = new JLabel();

    public CatItemRenderer() {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 2, 2, 2);

        labelItem.setOpaque(true);
        labelItem.setHorizontalAlignment(JLabel.LEFT);

        add(labelItem, constraints);
        setBackground(Color.WHITE);
    }


    @Override
    public Component getListCellRendererComponent(JList<? extends Cat> list, Cat value, int index, boolean isSelected, boolean cellHasFocus) {

        labelItem.setText(value.getName());


        ImageIcon icon = new ImageIcon(value.getImage());
        Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        labelItem.setIcon(new ImageIcon(img));


        if (isSelected) {
            labelItem.setForeground(Color.RED);
        } else {
            labelItem.setForeground(Color.BLACK);
        }

        return this;
    }


}
