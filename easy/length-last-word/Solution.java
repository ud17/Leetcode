// Runtime: 2 ms, faster than 18.32% of Java online submissions for Length of Last Word.
// Memory Usage: 42.2 MB, less than 54.94% of Java online submissions for Length of Last Word.

public class Solution {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        
        return result[result.length-1].length();
    }    
}
