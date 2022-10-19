public class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        
        if(start == end) return -1;
        
        while(start<=end) {
            if(nums[start] > 0) return -1;
            int abs = Math.abs(nums[start]);
            if(abs == nums[end]) return nums[end];
            
            if(abs > nums[end-1]) {
                start++;
            } else {
                end--;
            }
        }
        return -1;
    }
}