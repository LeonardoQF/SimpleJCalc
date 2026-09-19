package dev.leonardoqf.model;

import java.util.List;

import dev.leonardoqf.model.factories.MathStrategyFactory;

public class CalcModel {

    private static final String VALID_CHARACTERS = "1234567890 ";
    private final MathStrategyFactory strategyFactory;

    private double num1;
    private double num2;

    public CalcModel(MathStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public double calculate(char operator) {
        return strategyFactory.getStrategy(operator).calculate(num1, num2);
    }

    public void erase() {

    }

    public void clear() {
        num1 = 0;
        num2 = 0;
    }

    public void sqrt() {

    }

    public void equals() {
        
    }

    public boolean isValidExpression(String term) {
        if(term == null) throw new NullPointerException("Exp can't be null");

        List<Character> termChars = term.chars().mapToObj(c -> (char) c).toList();

        return termChars.stream().allMatch(c -> VALID_CHARACTERS.indexOf(c) >= 0) && !term.trim().isBlank();
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
