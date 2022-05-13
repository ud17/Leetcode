// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
// Memory Usage: 43.5 MB, less than 48.37% of Java online submissions for Search Insert Position.

public class SolutionTwo {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int left = 0, right = l-1;
        int search=-1;
    
        while(left<=right) {
            int mid = left + (right-left) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            
            if(target > nums[mid]) {
                left = mid + 1;
                search = mid + 1;
            } else {
                right = mid - 1;
                search = mid;
            }
        }
        return search;
    }
}
