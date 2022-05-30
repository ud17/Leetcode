class Solution {
    public int maxArea(int[] height) {
        
        int i=0, j=height.length-1;
        int result=-1;
        while(i<j) {
            int area = Math.min(height[i],height[j])*(j-i);
            
            if(height[i]>height[j]) {
                j--;
            } else {
                i++;
            }
            
            if(area>result) result=area;
        }
        return result;
    }
}