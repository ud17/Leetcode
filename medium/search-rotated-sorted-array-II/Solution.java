public class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length, start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target || nums[start] == target)
                return true;
            else if (nums[start] < nums[mid]) {
                if (target >= nums[start] && target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else if (nums[mid] < nums[end]) {
                if (nums[mid] < target &&  target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else
                start++;
        }
        return false;
    }
}