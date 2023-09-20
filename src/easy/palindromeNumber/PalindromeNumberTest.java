package easy.palindromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindromeYes() {
        int x=121;
        assertTrue(PalindromeNumber.isPalindrome(x));
    }

    @Test
    void isPalindromeWithZnak() {
        int x=-121;
        assertFalse(PalindromeNumber.isPalindrome(x));
    }

    @Test
    void isPalindromeNo() {
        int x=12;
        assertFalse(PalindromeNumber.isPalindrome(x));
    }

    @Test
    void isPalindromeZero() {
        int x=0;
        assertTrue(PalindromeNumber.isPalindrome(x));
    }
}