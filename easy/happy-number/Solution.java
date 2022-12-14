public class Solution {
    public boolean isHappy(int n) {                
        int num = n;
        while(true) {
            int sum = 0;
            while(true) {
                int y = num%10;
                sum += y*y;
                if(num<10) {
                    num = sum;
                    break;
                }
                num = num/10;
            }
            if(sum<10) return sum==1 || sum==7;
        }
    }
}
