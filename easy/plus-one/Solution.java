// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 40.6 MB, less than 88.60% of Java online submissions for Plus One.

public class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        for(int i=l-1; i>=0; i--) {
            if(digits[i]<9) {
                digits[i]++;
                return digits;
            }
            
            digits[i]=0;
        }
        
        int[] arr = new int[l+1];
        arr[0] = 1;
        return arr;
    }
}
