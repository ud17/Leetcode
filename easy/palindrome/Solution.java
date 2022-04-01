public class Solution {
    public boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        int length = input.length();
        String s1 = input.substring(0, length/2);
        String s2 = input.substring((length%2 == 0) ? length/2 : (length/2) + 1, length);
        
        String result="";
        for(int i=s2.length()-1; i>=0; i--) {
            result += s2.charAt(i);
        }
        
        return result.equals(s1);
    }
}