class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> wordMatch = new HashMap<>();
        String[] word = s.split(" ");
        char[] patternChar = pattern.toCharArray();
        
        if(patternChar.length != word.length) return false;
        
        for(int i=0; i<pattern.length(); i++) {
            char c = patternChar[i];
            
            if(wordMatch.containsKey(c)) {
                
                if(!wordMatch.get(c).equals(word[i])) return false;
            }
            else if(wordMatch.containsValue(word[i])) {
                return false;
            }
            else {
                wordMatch.put(c, word[i]);
            }
        }
        
        return true;
    }
}