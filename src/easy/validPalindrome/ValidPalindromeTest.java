package easy.validPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindromeEmpty() {
        String s ="";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeWithOnlySpace() {
        String s ="car ac";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeWithCase() {
        String s ="cAr ac";
        assertTrue(ValidPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeNo() {
        String s ="race a car";
        assertFalse(ValidPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindromeNoOneLetter() {
        String s ="0P";
        assertFalse(ValidPalindrome.isPalindrome(s));
    }

}