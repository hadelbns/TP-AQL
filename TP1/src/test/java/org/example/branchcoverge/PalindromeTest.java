package org.example.branchcoverge;
import org.example.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(Palindrome.isPalindrome("madam"));
        assertTrue(Palindrome.isPalindrome("racecar"));
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
        assertTrue(Palindrome.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    public void testIsNotPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
        assertFalse(Palindrome.isPalindrome("world"));
        assertFalse(Palindrome.isPalindrome("12345"));
    }

    @Test
    public void testIsNull() {
        assertThrows(NullPointerException.class, () -> {
            Palindrome.isPalindrome(null);
        });
    }
}