package com.company.catComboBox;

import com.company.Cat;

import javax.swing.*;

public class CatComboBox extends JComboBox<Cat> {
    private DefaultComboBoxModel<Cat> model;

    public CatComboBox() {
        model = new DefaultComboBoxModel<>();
        setModel(model);
        setRenderer(new CatItemRenderer());
        setEditor(new CatItemEditor());
    }

    public void addItems(Cat[] items) {
        for (Cat anItem : items) {
            model.addElement(anItem);
        }
    }
}
