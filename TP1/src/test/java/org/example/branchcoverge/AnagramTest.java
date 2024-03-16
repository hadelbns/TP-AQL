package org.example.branchcoverge;

import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void testIsAnagram() {
        assertTrue(Anagram.isAnagram("listen", "silent"));
        assertTrue(Anagram.isAnagram("funeral", "real fun"));
        assertTrue(Anagram.isAnagram("debit card", "bad credit"));
    }

    @Test
    public void testIsNotAnagramBecauseOfLetters() {
        assertFalse(Anagram.isAnagram("hello", "world"));
        assertFalse(Anagram.isAnagram("apple", "banana"));
        assertFalse(Anagram.isAnagram("cat", "dog"));
    }
    @Test
    public void testIsNotAnagramBecauseOfLength() {
        assertFalse(Anagram.isAnagram("hel", "world"));
        assertFalse(Anagram.isAnagram("apple", "bana"));
        assertFalse(Anagram.isAnagram("cat", "dg"));
    }

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, "test");
        });

        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram("test", null);
        });

        assertThrows(NullPointerException.class, () -> {
            Anagram.isAnagram(null, null);
        });
    }

}