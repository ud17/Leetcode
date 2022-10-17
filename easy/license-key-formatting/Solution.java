class Solution {
    public String licenseKeyFormatting(String s, int k) {
        
        String[] parts = s.split("-");
        
        if(parts.length == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<parts.length; i++) {
            sb.append(parts[i].toUpperCase());
        }
        
        String val = sb.toString();
        int inputLength = sb.toString().length();
        int firstHalf = inputLength%k;
        
        int iterations = inputLength%k == 0 ? inputLength/k : inputLength/k + 1;
        StringBuilder result = new StringBuilder();
        
        // substring firstHalf
        int idx = firstHalf == 0 ? k : firstHalf;
        result.append(val.substring(0, idx));
        //System.out.println(result.toString() + " " + iterations);
        for(int i=1; i<iterations; i++) {
            result.append("-");
            result.append(val.substring(idx, idx+k));
            idx=idx+k;
        }
        return result.toString();
    }
}