package easy.removeDuplicates;

public class RemoveDuplicates {
    public static int removeDublicates(int[] nums){
        int countDistinctElements = 1;
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
                countDistinctElements++;
            }
        }
        return countDistinctElements;
    }
}
