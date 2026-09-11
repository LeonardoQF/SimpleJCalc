package dev.leonardoqf;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dev.leonardoqf.view.*;

public class App {
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        CalcFrame introFrame = new CalcFrame();
        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("Error while getting system LAF");
        }
    }
}
