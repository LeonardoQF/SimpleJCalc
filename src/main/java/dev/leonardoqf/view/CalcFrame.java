package dev.leonardoqf.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CalcFrame extends JFrame {

    private JPanel buttonsPanel;

    public CalcFrame() {
        buttonsPanel = new ButtonsPanel();
        //Instantiate the panel before init

        init();
    }

    //Buttons panel should be sized 500x420, the gap 500x30, and the screen 500x150.

    public void init() {
        this.setTitle("SimpleJCalc");
        this.setSize(500, 600);
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);

        this.add(buttonsPanel);

        this.setVisible(true);
    }

}
