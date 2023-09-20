package easy.searchInsert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertTest {

    @Test
    void searchInsertExm1() {
        int nums[] = {1,3,5,6};
        int target = 5;
        int expectedResult = 2;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

    @Test
    void searchInsertExm2() {
        int nums[] = {1,3,5,6};
        int target = 2;
        int expectedResult = 1;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

    @Test
    void searchInsertExm3() {
        int nums[] = {1,3,5,6};
        int target = 7;
        int expectedResult = 4;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

    @Test
    void searchInsertZero() {
        int nums[] = {1,3,5,6};
        int target = 0;
        int expectedResult = 0;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

    @Test
    void searchInsertFirstNum() {
        int nums[] = {1,3};
        int target = 3;
        int expectedResult = 1;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

    @Test
    void searchInsertOneNum() {
        int nums[] = {1};
        int target = 1;
        int expectedResult = 0;
        assertEquals(expectedResult, SearchInsert.searchInsert(nums, target));
    }

}