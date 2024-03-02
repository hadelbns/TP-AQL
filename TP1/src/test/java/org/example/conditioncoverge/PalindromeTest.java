package org.example.conditioncoverge;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PalindromeTest {
    public void testIsPalindrome() {
        Assertions.assertTrue(Palindrome.isPalindrome("papa"));
        assertFalse(Palindrome.isPalindrome("radar"));
    }
    public void testIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("world"));
    }

    @Test
    public void testIsPalindrome_NullString() {
        Palindrome.isPalindrome(null);
    }

    @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    public void testIsPalindromeWithPalindromeUppercase() {
        assertTrue(Palindrome.isPalindrome("HADIL Benseid "));
    }


}