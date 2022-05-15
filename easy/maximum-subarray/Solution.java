// Runtime: 1 ms, faster than 100.00% of Java online submissions for Maximum Subarray.
// Memory Usage: 75.6 MB, less than 16.46% of Java online submissions for Maximum Subarray.

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > sum) {
                sum = nums[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}