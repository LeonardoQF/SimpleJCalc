package dev.leonardoqf.view;

import java.awt.Color;

import javax.swing.JFrame;

public class CalcFrame extends JFrame {

    public CalcFrame() {
        init();
    }


    public void init() {
        this.setSize(500, 600);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
