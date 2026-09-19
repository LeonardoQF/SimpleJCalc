package dev.leonardoqf.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dev.leonardoqf.model.factories.MathStrategyFactory;

public class CalcModelTests {

    CalcModel calc = new CalcModel(new MathStrategyFactory());

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
        assertFalse(calc.isValidExpression(""));
        assertFalse(calc.isValidExpression("4÷2"));
        assertFalse(calc.isValidExpression("    "));
        assertFalse(calc.isValidExpression("4x4xBxx0xNxPI"));
    }

    @Test 
    public void shouldThrowNullPointerException() {
       Exception exception = assertThrows(NullPointerException.class, () -> {
            calc.isValidExpression(null);
        });

        assertEquals("Exp can't be null", exception.getMessage());
    }

    @Test 
    public void testArithmeticOperations() {
        calc.setNum1(10);
        calc.setNum2(5);
        
        assertEquals(15.0, calc.calculate('+'));
        assertEquals(5, calc.calculate('-'));
        assertEquals(50, calc.calculate('x'));
        assertEquals(2, calc.calculate('÷'));
    }
    
}
