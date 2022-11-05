class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(List.of('a','e','i','o','u','A','E','I','O','U'));
        
        List<Character> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(vowels.contains(c)) {
                list.add(c);
            }
        }
        
        StringBuilder result = new StringBuilder(s);
        for(int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            if(vowels.contains(c)) {
                result.setCharAt(i, list.get(0));
                list.remove(0);
            }
        }
        
        return result.toString();
    }
}