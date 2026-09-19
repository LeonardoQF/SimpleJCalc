package dev.leonardoqf.view.buttons;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class CalcButton extends JButton {

    public CalcButton(String text) {
        super(text);
    }

    public void addControllerListener(ActionListener listener) {
        this.addActionListener(listener);
    }

}
