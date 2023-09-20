package easy.noAnswerlongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void searchMinLenghtTest() {
        String [] expectedResult = new String[]{"qweuy", "qwekl", "qwerty", };
        String [] strs = new String[]{"qwerty", "qweuy", "qwekl"};
        assertArrayEquals(expectedResult, LongestCommonPrefix.sortByLenght(strs));
    }

    @Test
    void searchMinLenghtTest2() {
        String [] expectedResult = new String[]{"1", "12", "123", };
        String [] strs = new String[]{"123", "1", "12"};
        assertArrayEquals(expectedResult, LongestCommonPrefix.sortByLenght(strs));
    }

    @Test
    void CommonPrefixIsAtBegin() {
        String [] strs = new String[]{"qwerty", "qweuy", "qwekl"};
        assertEquals("qwe", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void CommonPrefixIsAtEnd() {
        String [] strs = new String[]{"rtyqwe", "yqwe", "kqwe"};
        assertEquals("qwe", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void CommonPrefixIsInMiddle() {
        String [] strs = new String[]{"tjyesy", "yqyeswe", "kqwyesl"};
        assertEquals("yes", LongestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    void CommonPrefixNo() {
        String [] strs = new String[]{"qwert", "uiopkj", "xcvbhd"};
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(strs));
    }
}