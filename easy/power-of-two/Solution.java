public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        
        int a = 1, root = 0;
        while(root<=n && a < 31) {
            
            root = (int)Math.pow(2,a);
            if(root == n) return true;
            a++;
        }
        return false;
    }
}