package easy.next-greater-element-I;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            result[i] = lookupNum(nums2, nums1[i]);
        }
        
        return result;
    }
    
    private int lookupNum(int[] arr, int n) {
        int idx = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == n) {
                idx = i;
                break;
            } 
        }
        
        for(int i=idx; i<arr.length; i++) {
            if(arr[i] > n) return arr[i];
        }
        return -1;
    }
}
