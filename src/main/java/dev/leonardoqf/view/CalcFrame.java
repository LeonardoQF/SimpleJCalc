package dev.leonardoqf.view;

import java.awt.BorderLayout;
import java.awt.Color;

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
    //Buttons should have a margin from the sides of 25, and a distance between themselves of 18. The buttons should be sized x = 99.

    public void init() {
        this.setLayout(new BorderLayout(25, 25));
        this.setTitle("SimpleJCalc");
        this.setSize(500, 600);
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(buttonsPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

}
