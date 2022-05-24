public class Solution {
    public void moveZeroes(int[] nums) {
        
        int length = nums.length;
        for(int i=0; i<length; i++) {
            for(int j=0; j<length-1; j++) {
                if(nums[j] == 0) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}