public class SolutionTwo {
    public int search(int[] nums, int target) {
        int index=0;
        for(int i: nums) {
            if(i == target) return index;
            index++;
        }
        return -1;
    }
}
