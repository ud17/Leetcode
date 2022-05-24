public class SolutionTwo {
    public void moveZeroes(int[] nums) {
        int current = 0;
        int previous = 0;
        
        while(current < nums.length){
            
            if(nums[current] != 0){
                int temp = nums[current];
                nums[current] = nums[previous];
                nums[previous] = temp;
                previous++;
            }            
            current++;
        }
    }
}
