import java.util.*;;

class SolutionList {
    public int singleNumber(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for(int num: nums) {
            if(list.contains(num)) {
                int idx = list.indexOf(num);
                list.remove(idx);
            } else {
                list.add(num);
            }
        }
        
        return list.get(0);
    }
}
