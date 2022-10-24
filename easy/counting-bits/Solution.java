public class Solution {
    public int[] countBits(int n) {        
        int[] result = new int[n+1];
        
        for(int i=0; i<result.length; i++) {
            String bits = Integer.toBinaryString(i);
            int count = (int) bits.chars().filter(ch -> ch == '1').count();
            result[i] = count;
        }
        return result;
    }
}