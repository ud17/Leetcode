public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> response = new LinkedList();
        
        for(int i=0; i<numRows; i++) {
            
            List<Integer> curr = new ArrayList<>();
            if(i==0) {
                curr.add(1);
            } else if(i==1) {
                curr.add(1);
                curr.add(1);
            } else {
                List<Integer> dummy = response.get(i-1);
                curr.add(1);
                for(int j=0; j<dummy.size(); j++) {
                    int val = 0;
                    if(j+1<dummy.size()) {
                        val += dummy.get(j)+dummy.get(j+1);
                    } else {
                        val += dummy.get(j);
                    }
                    curr.add(val);
                }
            }
            response.add(curr);
        }
        return response;
    }
}