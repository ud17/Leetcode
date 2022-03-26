public class Solution {
    public int romanToInt(String s) {
        int num = 0;
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i=s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);
            map.put(i,c);
            switch(c) {
                case 'I':
                    if(i != s.length()-1) {
                        if((map.get(i) == 'I' && map.get(i+1) == 'V') || (map.get(i) == 'I' && map.get(i+1) == 'X')) {
                            num -=1;
                            break;
                        }
                    }
                    num += 1;                    
                    break;
                case 'V':
                    num += 5;
                    break;
                case 'X':
                    if(i != s.length()-1) {
                        if((map.get(i) == 'X' && map.get(i+1) == 'L') || (map.get(i) == 'X' && map.get(i+1) == 'C')) {
                            num -=10;
                            break;
                        }
                    }
                    num += 10;
                    break;
                case 'L':
                    num += 50;
                    break;
                case 'C':
                    if(i != s.length()-1) {
                        if((map.get(i) == 'C' && map.get(i+1) == 'D') || (map.get(i) == 'C' && map.get(i+1) == 'M')) {
                            num -=100;
                            break;
                        }
                    }
                    num += 100;
                    break;
                case 'D':
                    num += 500;
                    break;
                case 'M':
                    num += 1000;
                    break;
                default:
                    break;
            }
        }
        return num;
    }
}