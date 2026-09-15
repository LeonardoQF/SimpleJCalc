package dev.leonardoqf.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import dev.leonardoqf.view.buttons.CalcButton;
import dev.leonardoqf.view.buttons.FunctionButton;
import dev.leonardoqf.view.buttons.NumberButton;

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
            {new FunctionButton("<"), new FunctionButton("C"), new FunctionButton("sqrt"), new FunctionButton("÷")},
            {new NumberButton("7"), new NumberButton("8"), new NumberButton("9"), new FunctionButton("x")},
            {new NumberButton("4"), new NumberButton("5"), new NumberButton("6"), new FunctionButton("-")},
            {new NumberButton("1"), new NumberButton("2"), new NumberButton("3"), new FunctionButton("+")},
            {new NumberButton("0"), new NumberButton("."), new FunctionButton("="), new NumberButton(null)}
        };

        //For loop to add the buttons to the Panel as components
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                this.add(buttons[i][j]);
            }
        }

    }

}
