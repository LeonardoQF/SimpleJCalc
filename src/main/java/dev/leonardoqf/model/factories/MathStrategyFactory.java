package dev.leonardoqf.model.factories;

import dev.leonardoqf.model.strategies.DivisionStrategy;
import dev.leonardoqf.model.strategies.MathStrategy;
import dev.leonardoqf.model.strategies.MultiplicationStrategy;
import dev.leonardoqf.model.strategies.SubtractionStrategy;
import dev.leonardoqf.model.strategies.SumStrategy;

public class MathStrategyFactory {

    public MathStrategy getStrategy(char operator) {
        
        return switch(operator){
            case '÷' -> new DivisionStrategy();
            case 'x' -> new MultiplicationStrategy();
            case '+' -> new SumStrategy();
            case '-' -> new SubtractionStrategy();
            default -> throw new UnsupportedOperationException("Unsupported or unknown arithmetic expression");
        };
    }
    
}
