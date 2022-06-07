import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> response = new ArrayList<>();
        if(nums.length == 0) return response;
        int temp=-1, i=0, j=0;
        
        while(i<nums.length) {
            if(i>0) {
                if(nums[i]-1 != temp) {
                    if(nums[j] == nums[i-1]) {
                        response.add(nums[j] + "");
                    } else {
                        response.add(nums[j] + "->" + temp);    
                    }
                    j=i;
                }
            }
            temp = nums[i];
            i++;
        }
        
        if(nums[j] == nums[i-1]) {
            response.add(nums[i-1] + "");
        } else {
            response.add(nums[j] + "->" + temp);    
        }
        
        return response;
    }
}