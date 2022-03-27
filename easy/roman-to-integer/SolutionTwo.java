// Runtime: 3 ms, faster than 97.54% of Java online submissions for Roman to Integer.
// Memory Usage: 41.9 MB, less than 97.70% of Java online submissions for Roman to Integer.

public class SolutionTwo {
    public int romanToInt(String s) {
        int num = 0;
        int length = s.length()-1;
        
        for(int i=length; i>=0 ;i--) {
            char c = s.charAt(i);
            if(i != length) {
                if((c == 'I' && s.charAt(i+1) == 'V') || (c == 'I' && s.charAt(i+1) == 'X')) num-=1;                
                else if((c == 'X' && s.charAt(i+1) == 'L') || (c == 'X' && s.charAt(i+1) == 'C')) num-=10;                
                else if((c == 'C' && s.charAt(i+1) == 'D') || (c == 'C' && s.charAt(i+1) == 'M')) num-=100;
                else num += returnNumToAdd(c);
                continue;
            }
            num += returnNumToAdd(c);
        }
        return num;
    }
    
    private int returnNumToAdd(char c) {
        switch(c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                break;
        }
        return 0;
    }
}