class Solution {
    public String reverseWords(String s) {
        String[] result = s.split(" ");
        
        String output="";
        for(int i=0; i<result.length; i++) {
            String reversed = new StringBuilder(result[i]).reverse().toString();
            output += reversed;
            if(i != result.length-1)
                output += " ";
        }
        return output;
    }
}
