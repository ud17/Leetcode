public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums1.length; i++) {
            if(map.containsKey(nums1[i])) {
                int idx = map.get(nums1[i]);
                idx++;
                map.put(nums1[i], idx);
            } else {
                map.put(nums1[i], 1);   
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums2.length; i++) {
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                int idx = map.get(nums2[i]);
                idx--;
                map.put(nums2[i], idx);
                list.add(nums2[i]);
            }
        }
        
        int[] result = new int[list.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}