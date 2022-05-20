public class SolutionTwo {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        
        int[] copy = new int[nums.length];
        int index=0;
        for(int num: nums) {
            copy[index] = num;
            index++;
        }
        index=k;
        for(int num: copy) {
            nums[index] = num;
            index = index+1 < nums.length ? index+1 : (index+1) - (nums.length);
        }
        
    }
}
