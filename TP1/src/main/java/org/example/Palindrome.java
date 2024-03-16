package org.example;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            // Dans cette correction, j'ai échangé
            // les opérations d'incrémentation et de décrémentation pour i et j
            i++;
            j--;
        }
        return true;
    }
}
