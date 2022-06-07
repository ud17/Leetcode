import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> response = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++) {
            int start = nums[i];
            
            while(i<nums.length-1 && nums[i]+1 == nums[i+1])
                i++;
            
            if(start==nums[i]) {
                response.add(start + "");
            } else {
                response.add(start + "->" + nums[i]);
            }
        }        
        return response;
    }
}