package easy.noAnswerMajorityElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    void majorityElementFirstArray() {
        int [] array = new int [] {3,2,3};
        assertEquals(3, MajorityElement.majorityElement(array));
    }

    @Test
    void majorityElementSecondArray() {
        int [] array = new int [] {2,2,1,1,1,2,2};
        assertEquals(2, MajorityElement.majorityElement(array));
    }
}