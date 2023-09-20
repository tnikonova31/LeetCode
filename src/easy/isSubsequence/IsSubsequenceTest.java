package easy.isSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {

    @Test
    void isIsSubsequenceTrue() {
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceFalse() {
        String s = "axc";
        String t = "ahbgdc";
        assertFalse(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceEqualsString() {
        String s = "abc";
        String t = "abc";
        assertTrue(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceSIsEmpty() {
        String s = "";
        String t = "abc";
        assertTrue(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceTIsEmpty() {
        String s = "abc";
        String t = "";
        assertFalse(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceSAndTIsEmpty() {
        String s = "";
        String t = "";
        assertTrue(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceIndexFirstCharInEnd() {
        String s = "abc";
        String t = "hbgdac";
        assertFalse(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceOneChar() {
        String s = "b";
        String t = "c";
        assertFalse(IsSubsequence.isIsSubsequence(s, t));
    }

    @Test
    void isIsSubsequenceRepeatOneChar() {
        String s = "bb";
        String t = "ahbgdc";
        assertFalse(IsSubsequence.isIsSubsequence(s, t));
    }
}