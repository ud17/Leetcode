public class Solution {
    public int addDigits(int num) {
        
        return findLength(num);
    }

    private int findLength(int n) {
        int l = String.valueOf(n).length();
        if(l == 1) return n;
        int sum = 0;
        for(int i=0; i<l; i++) {
            sum += n%10;
            n = n/10;
        }

        int j = findLength(sum);
        return j;
    }
}
