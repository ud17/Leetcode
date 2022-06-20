public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i=0, j=0, index=0;
        List<Integer> result = new ArrayList<>();
        while(index<=nums1.length+nums2.length-2) {
            
            while(i<nums1.length-1 && nums1[i]==nums1[i+1]) i++;
            
            if(i<nums1.length && j<nums2.length && nums1[i] == nums2[j]) {
                if(!result.contains(nums1[i])) result.add(nums1[i]);
                while(i<nums1.length-1 && nums1[i]==nums1[i+1]) i++;
                while(j<nums2.length-1 && nums2[j]==nums2[j+1]) j++;
                i++;
                j++;
            } else {
                if(i<nums1.length && j<nums2.length) {
                    if(nums1[i] > nums2[j]) j++;
                    else i++;
                } else {
                    break;
                }              
            }

            index++;
        }
        
        int[] arr = new int[result.size()];
        for(int k=0; k<result.size(); k++) {
            arr[k] = result.get(k);
        }
        
        return arr;
    }
}