package com.capstone.smartwasher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public abstract class AddMachineForm extends JFrame implements ActionListener {
    JPanel machinePanel;
    JButton b2;
    JLabel makeLabel, modelLabel;
    JTextField textField3, textField4;

    AddMachineForm() {

        makeLabel = new JLabel();
        makeLabel.setText("Add machine make");


        textField3 = new JTextField(15);

        modelLabel = new JLabel();
        modelLabel.setText("Add machine model");


        textField4 = new JTextField(15);


        b2 = new JButton("ADD SMART WASHER");

        machinePanel = new JPanel(new GridLayout(3, 1));
        machinePanel.add(makeLabel);
        machinePanel.add(textField3);
        machinePanel.add(modelLabel);
        machinePanel.add(textField4);
        machinePanel.add(b2);


        b2.addActionListener(this);
        setTitle("MACHINE FORM");
    }

    public void addSmartWasher(ActionEvent actionEvent) {
        String makeValue = textField3.getText();
        String modelValue = textField4.getText();

        if (makeValue.equals("make") && modelValue.equals("model")) {

            NewPage2 page2 = new NewPage2();

            page2.setVisible(true);

            JLabel dev_label = new JLabel("Device add with make : " + makeValue + "and model: " + modelValue);

            page2.getContentPane().add(dev_label);
            page2.getContentPane().setBackground(Color.blue);

        } else {
            System.out.println("Invalid make and model information");
            showMessageDialog(null, "Please enter valid make and model");
        }
    }
}

