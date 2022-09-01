public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        String input = s.replaceAll("[^a-zA-Z0-9]+","").toLowerCase();
        
        int length = input.length();
        String one = input.substring(0, length/2);
        String two = input.substring(length % 2 == 0 ? length/2 : length/2 + 1 , length);
        
        return one.equals(new StringBuilder(two).reverse().toString());
    }
}