package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialPositive() {
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));
        assertEquals(5040, Factorial.factorial(7));
        assertEquals(40320, Factorial.factorial(8));
        assertEquals(362880, Factorial.factorial(9));
        assertEquals(3628800, Factorial.factorial(10));
    }
    @Test
    public void testFactorialZero(){
        assertEquals(1, Factorial.factorial(0));

    }
    @Test
    public void testFactorialOne(){
        assertEquals(1, Factorial.factorial(1));

    }

    @Test
    public void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
    }
}
