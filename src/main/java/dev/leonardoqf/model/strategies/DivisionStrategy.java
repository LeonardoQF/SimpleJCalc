package dev.leonardoqf.model.strategies;

public class DivisionStrategy implements MathStrategy {

    @Override
    public double calculate(double num1, double num2) {
        if(num2 == 0) throw new ArithmeticException("Cannot divide by zero");
        return  num1 / num2;
    }
    
}
