// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 41.6 MB, less than 93.30% of Java online submissions for Search Insert Position.

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int left = 0, right = l-1;
        int search=-1;
        
        if(target > nums[l-1]) return l;
        else if(target <= nums[0]) return 0;
    
        while(left<=right) {
            int mid = left + (right-left) / 2;
            
            if(nums[mid] == target) {
                search = mid;
                break;
            }
            
            if(target >= nums[mid] && target <= nums[mid+1]) {
                search = mid + 1;
                break;
            }
            
            if(target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return search;
    }
}