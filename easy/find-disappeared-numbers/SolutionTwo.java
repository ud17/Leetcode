public class SolutionTwo {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i:nums){
            int temp = Math.abs(i)-1;
            nums[temp] = -1*Math.abs(nums[temp]);
        }

        ArrayList<Integer> missing = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                missing.add(i+1);
            }
        }
        return missing;
    }
}
