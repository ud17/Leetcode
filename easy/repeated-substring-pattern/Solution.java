public class Solution {
    public boolean repeatedSubstringPattern(String haystack) {
        
        int length = haystack.length();
        if(length == 0 || length == 1) return false;
        
        boolean found = false;
        for(int i=1; i<=length/2; i++) {
            String match = haystack.substring(0, i);
            int temp = match.length();
            int start=i, end= i + temp;
            int counter = 0, index= (length-start)/temp;
            
            while(counter<=index) {
                if(start != length && !haystack.substring(start, end>length ? length : end).equals(match)) {
                    found = false;
                    break;
                } else found = true;
                start=end;
                end=start+temp;
                counter++;
            }
            
            if(found) break;
        }
        return found;
    }
}
