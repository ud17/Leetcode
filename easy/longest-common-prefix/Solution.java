// Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
// Memory Usage: 40.3 MB, less than 88.14% of Java online submissions for Longest Common Prefix.

public class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        int shortest=0;
        String shortestString = "";
        
        if(strs.length == 0) return "";
        else if(strs.length == 1) return strs[0];
        else {
            shortest = strs[0].length();
            shortestString = strs[0];
        }
        
        for(int i=0; i<strs.length; i++) {
            if(shortest > strs[i].length()){
                shortest = strs[i].length();
                shortestString = strs[i];
            }
        }
        
        int count = shortest;
        for(int i=0; i<strs.length; i++) {
            if(strs[i].equals(shortestString)) continue;
            int index=0;
            while(index < shortest) {
                
                char current = strs[i].charAt(index);
                if(current != shortestString.charAt(index)) {
                    if(count > index) {
                        count = index;
                    }
                    break;
                }
                index++;
            }
        }
        
        return count == 0 ? "" : shortestString.substring(0, count);
    }
}
