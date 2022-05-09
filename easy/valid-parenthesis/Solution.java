// Runtime: 1 ms, faster than 99.44% of Java online submissions for Valid Parentheses.
// Memory Usage: 40.5 MB, less than 81.10% of Java online submissions for Valid Parentheses.

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s.length() <= 1) return false;
        
        for(char curr : s.toCharArray()) {
            if(curr == '{' || curr == '[' || curr == '(') {
                stack.push(curr);
            }
            else if(curr == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } 
            else if(curr == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            else if(curr == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}