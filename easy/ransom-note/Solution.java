import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] input = ransomNote.toCharArray();
        List<Character> stack = new ArrayList<>();
        for(char c: input) {
            stack.add(c);
        }
        
        char[] match = magazine.toCharArray();
        for(char c: match) {
            if(!stack.isEmpty() && stack.contains(c)) {
                int idx = stack.indexOf(c);
                stack.remove(idx);
            }
        }
        return stack.isEmpty();
    }
}