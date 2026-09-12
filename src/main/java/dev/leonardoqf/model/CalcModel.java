package dev.leonardoqf.model;

import java.util.List;

public class CalcModel implements ExpressionCalculator {

    private final String VALID_CHARACTERS = "1234567890 ";

    public CalcModel() {

    }

    @Override
    public boolean calculate(String exp) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }

    //TODO should also verify whether an expression is legal
    @Override
    public boolean isValidExpression(String exp) {

        List<Character> expChars = exp.chars().mapToObj(c -> (char) c).toList();

        return expChars.stream().allMatch(c -> VALID_CHARACTERS.indexOf(c) >= 0);
    }

    @Override
    public double sum(double num1, double num2) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public double subtract(double num1, double num2) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public double multiply(double num1, double num2) {
        // TODO
        throw new UnsupportedOperationException("Unimplemented method 'multiply'");
    }

    @Override
    public double divide(double num1, double num2) {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }

}
