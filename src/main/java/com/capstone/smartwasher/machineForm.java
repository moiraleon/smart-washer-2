package com.capstone.smartwasher;

import javax.swing.*;

public class machineForm{

    public static void main(String[] args) {
        try{
            CreateLoginForm form2 = new CreateLoginForm();
            form2.setSize(300,100);
            form2.setVisible(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}