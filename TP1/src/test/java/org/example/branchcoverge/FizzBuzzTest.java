package org.example.branchcoverge;

import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void testFizzBuzzDivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", FizzBuzz.fizzBuzz(12));

    }

    @Test
    public void testFizzBuzzDivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(20));
        assertEquals("Buzz", FizzBuzz.fizzBuzz(25));

    }

    @Test
    public void testFizzBuzzDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(60));
    }

    @Test
    public void testFizzBuzzOtherNumbers() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("7", FizzBuzz.fizzBuzz(7));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
        assertEquals("11", FizzBuzz.fizzBuzz(11));
        assertEquals("13", FizzBuzz.fizzBuzz(13));
        assertEquals("14", FizzBuzz.fizzBuzz(14));
        assertEquals("16", FizzBuzz.fizzBuzz(16));

    }

    @Test
    public void testFizzBuzzNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(-1);
        });
    }

    @Test
    public void testFizzBuzzZeroInput() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzz.fizzBuzz(0);
        });
    }
}