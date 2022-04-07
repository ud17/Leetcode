// Runtime: 4 ms, faster than 59.82% of Java online submissions for Median of Two Sorted Arrays.
// Memory Usage: 49.9 MB, less than 48.84% of Java online submissions for Median of Two Sorted Arrays.

public class SolutionTwo {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;        
        int i = 0, j = 0, k = 0;
        int[] result = new int[length];
     
        while (i<nums1.length && j <nums2.length){
            if (nums1[i] < nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
     
        while (i < nums1.length)
            result[k++] = nums1[i++];
     
        while (j < nums2.length)
            result[k++] = nums2[j++];
        
        double median =0;
        if(length%2==0) {
            median = (result[(length/2)-1] + result[length/2]) / 2.0;
        } else {
            median = result[length/2];
        }
        return median;
    }
}