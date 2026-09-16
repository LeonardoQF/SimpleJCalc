package dev.leonardoqf.model;

import java.util.List;

import dev.leonardoqf.model.factories.MathStrategyFactory;

public class CalcModel {

    private final String VALID_CHARACTERS = "1234567890 ";
    private final MathStrategyFactory strategyFactory;

    public CalcModel(MathStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public double calculate(double num1, double num2, char operator) {
        return strategyFactory.getStrategy(operator).calculate(num1, num2);
    }

    public boolean isValidExpression(String term) {
        if(term == null) throw new NullPointerException("Exp can't be null");

        List<Character> expChars = term.chars().mapToObj(c -> (char) c).toList();

        return expChars.stream().allMatch(c -> VALID_CHARACTERS.indexOf(c) >= 0) && !term.trim().isBlank();
    }
}
