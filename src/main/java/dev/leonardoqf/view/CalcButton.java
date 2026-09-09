package dev.leonardoqf.view;

import javax.swing.JButton;

public class CalcButton extends JButton {

    private final String key;

    public CalcButton(String key) {
        this.key = key;
        this.setText(key);
    }

    public String getKey() {
        return key;
    }

}
