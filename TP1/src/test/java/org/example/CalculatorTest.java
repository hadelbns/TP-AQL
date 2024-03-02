package org.example;

import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testMax_1() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.max(1, 2, 3));
    }

    @Test
    public void testMax_2() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.max(3, 2, 1));
    }

    @Test
    public void testMax_3() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.max(2, 3, 1));
    }

    @Test
    public void testMax_4() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.max(1, 1, 1));
    }
}
