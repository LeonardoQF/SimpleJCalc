package dev.leonardoqf.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {

    private CalcButton[][] buttons;

    public ButtonsPanel() {
        init();
        initButtons();
    }


    private void init() {
        this.setLayout(new GridLayout(5, 4, 15, 15));
        this.setBackground(Color.DARK_GRAY);
        this.setPreferredSize(new Dimension(500, 300));
    }

    public void initButtons() {

        buttons = new CalcButton[][] {
            {new CalcButton("<"), new CalcButton("C"), new CalcButton("sqrt"), new CalcButton("÷")},
            {new CalcButton("7"), new CalcButton("8"), new CalcButton("9"), new CalcButton("x")},
            {new CalcButton("4"), new CalcButton("5"), new CalcButton("6"), new CalcButton("-")},
            {new CalcButton("1"), new CalcButton("2"), new CalcButton("3"), new CalcButton("+")},
            {new CalcButton("0"), new CalcButton("."), new CalcButton("="), new CalcButton(null)}
        };

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                this.add(buttons[i][j]);
            }
        }

    }

}
