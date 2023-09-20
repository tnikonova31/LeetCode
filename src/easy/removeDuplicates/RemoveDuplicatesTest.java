package easy.removeDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDublicates() {
        int nums[] = {1,1,2};
        int k=2;
        assertEquals(k,RemoveDuplicates.removeDublicates(nums));
    }

    @Test
    void removeDublicatesSecond() {
        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        int k=5;
        assertEquals(k,RemoveDuplicates.removeDublicates(nums));
    }
}