public class SolutionTwo {
    public void sortColors(int[] nums) {
        int i = -1, j = nums.length;
        int ans = 0;
        while (ans < j) {
            if (nums[ans] == 0) {
                swap(nums, ans++, ++i);
            } else if (nums[ans] == 1) {
                ++ans;
            } else {
                swap(nums, ans, --j);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int x = nums[i];
        nums[i] = nums[j];
        nums[j] = x;
    }
}