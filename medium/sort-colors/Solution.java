public class Solution {
    public void sortColors(int[] nums) {
        int zero=0, one=0, two=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) one++;
            else two++;
        }
        
        for(int i=0; i<nums.length; i++) {
            if(i<zero) nums[i] = 0;
            else if(i<zero+one) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}