package dev.leonardoqf.view.buttons;

import javax.swing.JButton;

public abstract class CalcButton extends JButton {

    public CalcButton(String text) {
        super(text);
    }

    public abstract void act();

}
