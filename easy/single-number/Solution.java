import java.util.*;;

class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int num: nums) {
            if(hashMap.containsKey(num)) {
                hashMap.put(num, 0);
            } else {
                hashMap.put(num, -1);
            }
        }
        
        for (int key : hashMap.keySet()) {
            if(hashMap.get(key) == -1) return key;
        }
        return -1;
    }
}