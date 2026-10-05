package dev.leonardoqf.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class CalcFrame extends JFrame {

    private ButtonsPanel buttonsPanel;
    private InputField inputField;
    private HistoryOutputPanel outputPanel;

    public CalcFrame() {
        buttonsPanel = new ButtonsPanel();
        inputField = new InputField();
        outputPanel = new HistoryOutputPanel();
        //Instantiate the panel before init


        init();
    }

    private void init() {
        this.setLayout(new BorderLayout());
        this.setTitle("SimpleJCalc");
        this.setSize(500, 600);
        this.getContentPane().setBackground(Color.GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);


        this.add(buttonsPanel, BorderLayout.SOUTH);
        this.add(inputField, BorderLayout.CENTER);
        this.add(outputPanel, BorderLayout.NORTH);

        this.setVisible(true);
    }

    public ButtonsPanel getButtonsPanel() {
        return this.buttonsPanel;
    }

    public InputField getInputField() {
        return this.inputField;
    }

    public HistoryOutputPanel getOutputPanel() {
        return this.outputPanel;
    }

}
