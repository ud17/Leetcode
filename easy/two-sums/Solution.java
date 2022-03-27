public class Solution {
    public int[] twoSum(int[] nums, int target) {
            
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++) {
            int num = target - nums[i];
            for(int j=i; j<nums.length; j++) {
                if(j!=i && nums[j] == num) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }        
        return result;
    }
}
