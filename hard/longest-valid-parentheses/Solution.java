import java.util.*;

class Solution {
    public int longestValidParentheses(String s) {
        int length = s.length();
        if(length == 0 || length == 1) return 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<length; i++) {
            char c = s.charAt(i);
            if(c == ')' && !stack.isEmpty() && s.charAt(stack.peek()) == '(') {
                stack.pop();
            } else {
                stack.push(i);
            }
        }
        int max=0, index=-1;
        for(int i: stack) {
            max = Math.max(max, i-index-1);
            index=i;
        }
        max = Math.max(max, length-index-1);
        return max;
    }
}
