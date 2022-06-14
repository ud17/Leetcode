public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        
        List<Integer> response = new ArrayList<>();
        int i=0;
        for(int j=1; j<=nums.length; j++) {
            while(i<nums.length-1 && nums[i] == nums[i+1]) i++;
            if(nums[i] != j) response.add(j);
            if(nums[i]==j && i<nums.length-1) i++;
        }
        return response;
    }
}
