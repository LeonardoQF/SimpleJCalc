package dev.leonardoqf.model;

public interface ExpressionCalculator {

    public boolean calculate(String exp);
    public boolean isValidExpression(String exp);

    public double sum(double num1, double num2);
    public double subtract(double num1, double num2);
    public double multiply(double num1, double num2);
    public double divide(double num1, double num2);
}
