package easy.validParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValidTwoRightBrackets() {
        String s = "()";
        assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    void isValidAllBraskets() {
        String s = "()[]{}";
        assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    void isValidTwoDifferentBraskets() {
        String s = "(]";
        assertEquals(false, ValidParentheses.isValid(s));
    }

    @Test
    void isValidCloseBrasketsOneByOne() {
        String s = "(])";
        assertEquals(false, ValidParentheses.isValid(s));
    }

    @Test
    void isValidSeveralClosedBraskets() {
        String s = "{[]}";
        assertEquals(true, ValidParentheses.isValid(s));
    }

    @Test
    void isValidMessedUpBraskets() {
        String s = "{[]}][";
        assertEquals(false, ValidParentheses.isValid(s));
    }
}