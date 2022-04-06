public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        
        int size = 0;
        for(int i=0; i<length; i++) {        
            String curr = s.charAt(i) + "";
            
            for(int j=i+1; j<length; j++) {
                String nw = s.charAt(j) + "";
                if(!curr.contains(nw)) {
                    curr += nw;
                } else {
                    break;
                }                
            }
            if(size < curr.length())
                size = curr.length();
        }        
        return size;
    }
}