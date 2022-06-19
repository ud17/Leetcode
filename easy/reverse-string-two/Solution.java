public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        for(int start=0; start<arr.length; start += 2*k) {
            int low = start, high = Math.min(low+k-1, arr.length-1);
            while(low<high) {
                char temp = arr[high];
                arr[high--] = arr[low];
                arr[low++] = temp;
            }
        }
        return new String(arr);
    }
}