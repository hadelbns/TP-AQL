package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FibonacciTest {
  // ona 4 classe d'equivalences
    @Test
    // on peut utiliser les test parametree ici
    public void testFibonacci() {

        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));
        assertEquals(55, Fibonacci.fibonacci(10));
        assertEquals(89, Fibonacci.fibonacci(11));
        assertEquals(144, Fibonacci.fibonacci(12));
    }
    @Test
    public void testFibonnacciZero(){
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonnacciOne (){
        assertEquals(1, Fibonacci.fibonacci(1));
    }




    @Test
    // verifie esque l'exeception est levee si n est negatif
    public void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Fibonacci.fibonacci(-1);
        });
    }
}
