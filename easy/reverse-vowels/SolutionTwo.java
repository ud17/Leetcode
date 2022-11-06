class SolutionTwo {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>(List.of('a','e','i','o','u','A','E','I','O','U'));
        char[] character = s.toCharArray();
        
        int start=0, end=s.length()-1;
        while(start<end) {
            while(start<end && !vowels.contains(character[start])) start++;
            while(start<end && !vowels.contains(character[end])) end--;
            
            char temp = character[start];
            character[start] = character[end];
            character[end] = temp;
            start++;
            end--;
        }
        
        return String.valueOf(character);
    }
}