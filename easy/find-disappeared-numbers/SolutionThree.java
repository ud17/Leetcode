public class SolutionThree {
    public List<Integer> findDisappearedNumbers(int[] nums) {
            int n=nums.length;
            List<Integer> missing =new ArrayList<Integer>();  
            int k=0;
            int i=0;
            
            while(i<n) {
                k=nums[i]-1;
              
                if(nums[i]<=n && nums[i]!=nums[k]) {
                         int temp=nums[i];
                         nums[i]=nums[k];
                         nums[k]=temp;                 
                }
                else
                i++;
            }
        
            for(i=0;i<n;i++) {
                if(i!=nums[i]-1) {
                    missing.add(i+1);
                }
            }
            return missing;  
        } 
    }