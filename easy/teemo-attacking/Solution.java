class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int attackDuration = 0;
        int length = timeSeries.length;
        
        for(int i=0; i<length-1; i++) {
            
            if(timeSeries[i] + (duration-1) < timeSeries[i+1]) {
                attackDuration += duration;
            } else {
                attackDuration += timeSeries[i+1] - timeSeries[i];
            }
        }
        
        // add the last attack
        return attackDuration + duration;
    }
}