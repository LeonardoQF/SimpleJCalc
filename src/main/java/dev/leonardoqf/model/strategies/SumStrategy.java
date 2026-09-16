package dev.leonardoqf.model.strategies;

public class SumStrategy implements MathStrategy {

    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }
    
}
