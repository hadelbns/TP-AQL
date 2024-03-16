package org.example.conditioncoverge;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("radar"));
    }
    @Test
    public void testIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }


    @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    public void testIsPalindromeWithPalindromeUppercase() {
        assertTrue(Palindrome.isPalindrome("HADIL Benseid "));
    }


}