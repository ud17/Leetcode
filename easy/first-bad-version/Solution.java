/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int index=0;
        
        while(left<=right) {
            int mid= left+(right-left)/2; 
            boolean ver = isBadVersion(mid);
            if(ver) {
                index=mid;
                right = mid-1;
            }
            else left = mid+1;
            
        }
        return index;
    }
}