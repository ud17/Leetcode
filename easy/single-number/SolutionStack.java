import java.util.*;

class SolutionStack {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        Stack<Integer> stack = new Stack<>();
        for(int num: nums) {
            if(stack.contains(num)) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        return stack.pop();
    }
}