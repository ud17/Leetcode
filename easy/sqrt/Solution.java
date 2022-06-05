public class Solution {
    public int mySqrt(int number) {

        if(number ==0) return 0;
        else if(number==1) return 1;

        double t;
        double squareroot = number / 2;
        do 
        {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        }
        while ((t - squareroot) != 0);
        return (int)squareroot;
    }
}