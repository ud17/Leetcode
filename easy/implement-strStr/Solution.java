// Runtime: 1 ms, faster than 71.34% of Java online submissions for Implement strStr().
// Memory Usage: 42.5 MB, less than 34.67% of Java online submissions for Implement strStr().

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        
        int l = needle.length();
        if(l > haystack.length()) return -1;
        
        int result=-1;
        for(int i=0; i<haystack.length() - l + 1; i++) {
            if(haystack.substring(i, i+l).equals(needle)) {
                result=i;
                break;
            }
        }
        return result;
    }
}