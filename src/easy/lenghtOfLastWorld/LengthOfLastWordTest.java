package easy.lenghtOfLastWorld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWordWithoutSpace() {
        String s = "Hello World";
        assertEquals(5, LengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordWithOneSpace() {
        String s = " лети со мной на луну ";
        assertEquals(4, LengthOfLastWord.lengthOfLastWord(s));
    }

    @Test
    void lengthOfLastWordWithMoreSpace() {
        String s = " лети со мной на луну  ";
        assertEquals(4, LengthOfLastWord.lengthOfLastWord(s));
    }
}