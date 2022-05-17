// Runtime: 12 ms, faster than 11.29% of Java online submissions for Add Binary.
// Memory Usage: 44.9 MB, less than 5.32% of Java online submissions for Add Binary.

class Solution {
    public String addBinary(String one, String two) {
        
        int length = one.length() > two.length() ? one.length() : two.length();
        int a=one.length()-1, b=two.length()-1;
        int carry=0;
        String result="";
        for(int i=length-1; i>=0; i--) {
            
            int abit = a >= 0 ? Integer.parseInt(String.valueOf(one.charAt(a))) : 0;
            int bbit = b >= 0 ? Integer.parseInt(String.valueOf(two.charAt(b))) : 0;
            
            int val = ((carry + abit+ bbit) % 2) == 0 ? 0 : 1;
            carry = (abit+bbit+carry) > 1 ? 1 : 0;
            
            result = val + result;
            a--;
            b--;
        }
        
        if(carry >= 1) result = "1" + result;
        return result;
    }
}
