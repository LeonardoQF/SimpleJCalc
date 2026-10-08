package dev.leonardoqf.model.states;

public interface CalcContextState {
    
    void handleNumber(String digit);
    void handleOperator(char operator);
    void handleEquals();
    void handleSqrt();
    void handleErase();
}
