package easy.romanToInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

   @Test
    void romanToIntThree() {
        assertEquals(3, RomanToInteger.romanToInt("III"));
    }

    @Test
    void romanToIntFour() {
        assertEquals(4, RomanToInteger.romanToInt("IV"));
    }

    @Test
    void romanToIntNine() {
        assertEquals(9, RomanToInteger.romanToInt("IX"));
    }

    @Test
    void romanToIntFourty() {
        assertEquals(40, RomanToInteger.romanToInt("XL"));
    }

    @Test
    void romanToIntNinety() {
        assertEquals(90, RomanToInteger.romanToInt("XC"));
    }

    @Test
    void romanToIntFourHundr() {
        assertEquals(400, RomanToInteger.romanToInt("CD"));
    }

    @Test
    void romanToIntNineHundr() {
        assertEquals(900, RomanToInteger.romanToInt("CM"));
    }

    @Test
    void romanToIntTest() {
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }
}