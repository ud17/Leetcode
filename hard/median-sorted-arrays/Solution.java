// Runtime: 7 ms, faster than 23.83% of Java online submissions for Median of Two Sorted Arrays.
// Memory Usage: 51.5 MB, less than 6.49% of Java online submissions for Median of Two Sorted Arrays.

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        
        int[] result = new int[length];
        for(int i =0; i<length; i++) {
            if(i<nums1.length) {
                result[i]=nums1[i];
            } else {
                result[i] = nums2[i-nums1.length];
            }
        }
        
        Arrays.sort(result);
        double median =0;
        if(length%2==0) {
            median = (result[(length/2)-1] + result[length/2]) / 2.0;
        } else {
            median = result[length/2];
        }
        return median;
    }
}