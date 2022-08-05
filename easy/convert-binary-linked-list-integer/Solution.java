public class Solution {
    public int getDecimalValue(ListNode head) {
        
        ListNode prev = null;
        int idx=0;
        
        while(head!=null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
            idx++;
        }
        
        int result = 0;
        for(int i=0; i<idx; i++) {
            if(prev.val == 1) {
                result += Math.pow(2, i);
            }            
            prev = prev.next;
        }
        return result;
    }
}