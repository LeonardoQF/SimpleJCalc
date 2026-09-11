package dev.leonardoqf.view;

import javax.swing.JButton;

public class CalcButton extends JButton {

    public CalcButton(String text) {
        super(text);
        this.addActionListener(a -> System.out.println(this.getText()));
    }


}
