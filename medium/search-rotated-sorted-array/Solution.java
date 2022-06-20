public class Solution {
    public int search(int[] nums, int target) {
        int pivot = peak(nums);
        
        if(pivot == -1) return binarySearch(nums, 0, nums.length-1, target);
        
        if(nums[pivot] == target) return pivot;
        
        if(target>=nums[0]) return binarySearch(nums, 0, pivot-1, target);
        else return binarySearch(nums, pivot+1, nums.length-1, target);
    }
    
    private int peak(int[] arr) {
        int left=0, right=arr.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            
            if(mid<right && arr[mid]>arr[mid+1]) return mid;
            
            if(mid>left && arr[mid]<arr[mid-1]) return mid-1;
            
            if(arr[left]>=arr[mid]) right=mid-1;
            else left=mid+1;
        }
        return -1;
    }
    
    private int binarySearch(int[] arr, int low, int high, int target) {
        while(low<=high) {
            int mid = low + (high-low)/2;
            
            if(arr[mid] == target) return mid;
            
            if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}