// Runtime: 1 ms, faster than 91.23% of Java online submissions for Remove Duplicates from Sorted Array.
// Memory Usage: 43.9 MB, less than 84.92% of Java online submissions for Remove Duplicates from Sorted Array.

public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
    
        for (int i = 0; i < nums.length; i++) {
    
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}