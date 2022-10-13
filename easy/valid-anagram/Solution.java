public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        
        int idx=0;
        for(char c: sChar) {
            if(tChar[idx] != c) return false;
            idx++;
        }
        return true;
    }
}