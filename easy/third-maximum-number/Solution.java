public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int index=-1, count=0;
        for(int i=nums.length-1; i>=0; i--) {
            
            while(i>0 && nums[i] == nums[i-1]) i--;
            count++;
            if(count==3) {
                index=i;
                break;
            }
        }
        
        return count<3 ? nums[nums.length-1] : nums[index];
    }
}