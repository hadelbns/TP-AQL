package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void testIsPrime() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
        assertTrue(Prime.isPrime(13));
        assertTrue(Prime.isPrime(17));
        assertTrue(Prime.isPrime(19));
        assertTrue(Prime.isPrime(23));
        assertTrue(Prime.isPrime(29));
    }

    @Test
    public void testIsNotPrime() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(10));
        assertFalse(Prime.isPrime(12));
        assertFalse(Prime.isPrime(14));
        assertFalse(Prime.isPrime(15));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(Prime.isPrime(-1));
    }
}
