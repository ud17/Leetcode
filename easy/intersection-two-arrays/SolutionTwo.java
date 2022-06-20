// Binary Search Approach

class SolutionTwo {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums1.length; i++) {
            if(find(nums1[i], nums2)) {
                if(!result.contains(nums1[i])) result.add(nums1[i]);
            }
        }
        
        int[] arr = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            arr[i] = result.get(i);
        }
        
        return arr;
    }
    
    public boolean find(int num, int[] arr) {
        int left=0, right=arr.length-1;
        while(left<=right) {
            int med = left + (right-left)/2;
            
            if(arr[med] == num) return true;
            
            if(arr[med] > num) right=med-1;
            else left = med+1;
        }
        return false;
    }
}