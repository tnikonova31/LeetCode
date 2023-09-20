package easy.twoSum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSumStartArray() {
        int [] nums = new int[] {2,7,11,15};
        int target = 9;
        int [] numsExpected = new int[] {0,1};
        assertArrayEquals(numsExpected, TwoSum.twoSum(nums, target));
    }
    @Test
    void twoSumEndArray() {
        int [] nums = new int[] {3,2,4};
        int target = 6;
        int [] numsExpected = new int[] {1,2};
        assertArrayEquals(numsExpected, TwoSum.twoSum(nums, target));
    }
    @Test
    void twoSumAllArray() {
        int [] nums = new int[] {3,3};
        int target = 6;
        int [] numsExpected = new int[] {0,1};
        assertArrayEquals(numsExpected, TwoSum.twoSum(nums, target));
    }

    @Test
    void twoSumThroghNumber() {
        int [] nums = new int[] {2,11,7,15};
        int target = 9;
        int [] numsExpected = new int[] {0,2};
        assertArrayEquals(numsExpected, TwoSum.twoSum(nums, target));
    }

    @Test
    void twoSumNegativNumber() {
        int [] nums = new int[] {-1,-2,-3,-4,-5};
        int target = -8;
        int [] numsExpected = new int[] {2,4};
        assertArrayEquals(numsExpected, TwoSum.twoSum(nums, target));
    }
}