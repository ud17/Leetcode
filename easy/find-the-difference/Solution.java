class Solution {
    public char findTheDifference(String s, String t) {
        
        char[] nonMatchingChars = t.toCharArray();
        char[] inputString = s.toCharArray();
        
        Arrays.sort(nonMatchingChars);
        Arrays.sort(inputString);
        
        for(int i=0; i<s.length(); i++) {
            if(nonMatchingChars[i] != inputString[i]) return nonMatchingChars[i];
        }

        return nonMatchingChars[nonMatchingChars.length-1];
    }
}