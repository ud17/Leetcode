import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int index=0, max=0;
        int i=0;
        
        while(i<nums.length) {
            int count = 0;
            while(i+1 < nums.length && nums[i] == nums[i+1]) {
                i++;
                count++;
            }
            if(count > max) {
                max = count;
                index = i-count;
            }
            i++;
        }
        return nums[index];
    }
}