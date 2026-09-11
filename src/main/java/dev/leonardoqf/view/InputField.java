package dev.leonardoqf.view;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFormattedTextField;


public class InputField extends JFormattedTextField {

    public InputField() {
        this.setEditable(true);
        this.setPreferredSize(new Dimension(500, 100));
        this.setFont(new Font("Ubuntu", Font.PLAIN, 40));
    }


}
