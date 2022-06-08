public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num = -1;
        for(int i=0; i<nums.length; i++) {
            if(i!=nums[i]) {
                num = i;
                break;
            }
        }
        return num == -1 ? nums.length : num;
    }
}