package dev.leonardoqf;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dev.leonardoqf.controller.CalcController;
import dev.leonardoqf.model.CalcModel;
import dev.leonardoqf.model.factories.MathStrategyFactory;
import dev.leonardoqf.view.*;

/*Instead of allowing the user to write a whole expression and then painstakingly parsing it,
I could make it behave like a simple calculator: You type a value, press the operation button, then input the second value and = and BAM, you get the number.
*/



public class App {
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        CalcModel model = new CalcModel(new MathStrategyFactory());

        CalcFrame view = new CalcFrame();

        CalcController controller = new CalcController(model, view);

        } catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("Error while getting system LAF");
        }
    }
}
