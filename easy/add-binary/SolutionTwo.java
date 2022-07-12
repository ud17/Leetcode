class SolutionTwo {
    public String addBinary(String one, String two) {
        
        StringBuilder result = new StringBuilder("");
        int a = one.length()-1;
        int b = two.length()-1;
        int carry = 0;
        
        while(a >= 0 || b >= 0) {
            int abit = a >= 0 ? one.charAt(a) : '0';
            int bbit = b >= 0 ? two.charAt(b) : '0';
            
            if(carry == 0) {
                
                if(abit == '1' && bbit == '1') {
                    carry = 1;
                    result.append("0");
                } 
                else if(abit == '0' && bbit == '0') {
                    carry = 0;
                    result.append("0");
                } 
                else {
                    carry = 0;
                    result.append("1");
                }
            } else {
                if(abit == '1' && bbit == '1') {
                    carry = 1;
                    result.append("1");
                } 
                else if(abit == '0' && bbit == '0') {
                    carry = 0;
                    result.append("1");
                } 
                else {
                    carry = 1;
                    result.append("0");
                }
            }
            
            a--;
            b--;
        }
        
        if(carry == 1) result.append("1");
        return result.reverse().toString();
    }
}