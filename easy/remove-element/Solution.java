// Runtime: 2 ms, faster than 27.76% of Java online submissions for Remove Element.
// Memory Usage: 43.6 MB, less than 7.26% of Java online submissions for Remove Element.
import java.util.*;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums.length; i++) {
            stack.push(nums[i]);
        }
        int index =0;
        while(index<nums.length) {
            if(stack.peek() == val) {
                stack.pop();
            } else {
                nums[count] = stack.peek();
                stack.pop();
                count++;
            }
            index++;
        }
        return count;
    }
}