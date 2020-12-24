package com.company.catComboBox;

import com.company.Cat;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.*;

public class CatItemEditor extends BasicComboBoxEditor {
    private JPanel panel = new JPanel();
    private JLabel labelItem = new JLabel();
    private Cat selectedValue;

    public CatItemEditor() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 5, 2, 2);

        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setForeground(Color.BLACK);

        panel.add(labelItem, constraints);
        panel.setBackground(Color.WHITE);
    }

    public Component getEditorComponent() {
        return this.panel;
    }

    public Object getItem() {
        return this.selectedValue;
    }

    public void setItem(Object item) {
        if (item == null) {
            return;
        }
        Cat selectedCat = (Cat) item;
        selectedValue = selectedCat;
        labelItem.setText(selectedValue.getName());

        ImageIcon icon = new ImageIcon(selectedValue.getImage());
        Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        labelItem.setIcon(new ImageIcon(img));

    }
}
