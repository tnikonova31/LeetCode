package easy.removeElement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int [] expectedNums = new int[nums.length];
        int countNums = 0;
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == val){
                countNums++;
            } else{
                expectedNums[index]=nums[i];
                index++;
            }
        }
        for(int i=0; i<index; i++){
            nums[i]=expectedNums[i];
        }
        return nums.length-countNums;
    }



}
