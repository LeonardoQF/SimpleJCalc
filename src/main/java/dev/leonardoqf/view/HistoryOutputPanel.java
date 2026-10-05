package dev.leonardoqf.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HistoryOutputPanel extends JPanel {

    private JLabel resultLabel;

    public HistoryOutputPanel() {
        this.setPreferredSize(new Dimension(500, 200));
        this.setBackground(Color.GRAY);

        // ResultLabel config
        resultLabel = new JLabel();
        resultLabel.setFont(new Font("Ubuntu", Font.PLAIN, 70));
        resultLabel.setText("0.0");
        this.add(resultLabel);
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }


    
}
