package dev.leonardoqf;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dev.leonardoqf.view.*;

/*Instead of allowing the user to write a whole expression and then painstakingly parsing it,
I could make it behave like a simple calculator: You type a value, press the operation button, then input the second value and = and BAM, you get the number.
*/



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
