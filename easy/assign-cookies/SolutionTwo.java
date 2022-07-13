public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int greed = 0;
        int cookie = 0;
        int child = 0;
        
		while(greed != g.length && cookie != s.length){
            if(g[greed] <= s[cookie]){
                child++;
                greed++;
                cookie++;
            } else {
                cookie++;
            }
        }
        return child;
    }
}