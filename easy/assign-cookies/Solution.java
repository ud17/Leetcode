public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int children=0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        for(int i=0; i<s.length; i++) {
            
            if(g.length==children) break;
            
            if(s[i]>=g[children]) children++;
        }
        return children;
    }
}