package easy.searchInsert;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int startIndex=0, endIndex=nums.length-1;
        int middleIndex;
            while(startIndex <= endIndex) {
                middleIndex = (startIndex + endIndex) / 2;
                // если средний элемент - целевой элемент, вернуть его индекс
                if (nums[middleIndex] == target) {
                    return middleIndex;
                }
                // если средний элемент меньше
                // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
                else if (nums[middleIndex] < target)
                    startIndex = middleIndex + 1;
                    // если средний элемент больше
                    // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
                else if (nums[middleIndex] > target)
                    endIndex = middleIndex - 1;
            }
        return startIndex;
    }
}
