package easy.removeElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    @Test
    void removeElementFirstTest() {
        int [] nums = new int[] {3,2,2,3};
        int val = 3;
        assertEquals(2, RemoveElement.removeElement(nums, val));
    }

    @Test
    void removeElementSecondTest() {
        int [] nums = new int[] {0,1,2,2,3,0,4,2};
        int val = 2;

        assertEquals(5, RemoveElement.removeElement(nums, val));
    }
}