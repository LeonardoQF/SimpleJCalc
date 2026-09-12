package dev.leonardoqf.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalcModelTests {

    CalcModel calc = new CalcModel();

    @Test 
    public void shouldBeValid() {
        assertTrue(calc.isValidExpression("55 "));
        assertTrue(calc.isValidExpression("400 3 "));
        assertTrue(calc.isValidExpression("343   "));

    }

    @Test
    public void shouldBeInvalid() {
        assertFalse(calc.isValidExpression("4a"));
        assertFalse(calc.isValidExpression("SushiIsNice"));

        assertFalse(calc.isValidExpression("4x4xBxx0xNxPI"));
    }
    
}
