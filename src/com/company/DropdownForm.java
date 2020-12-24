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


        for (PaymentType type : PaymentType.values()) {
            comboBox1.addItem(type.toString());
        }

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = comboBox1.getSelectedIndex();
                if (selectedIndex == 0) {
                    pay(PaymentType.CARD);
                } else if (selectedIndex == 0) {
                    pay(PaymentType.CARD);
                }
                //System.out.println(elementsToChoose[selectedIndex]);
            }
        });
    }

    enum PaymentType {
        CASH,
        CARD
    }

    public void pay(PaymentType selectedPaymentType) {

    }
}
