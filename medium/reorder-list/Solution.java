class Solution {
    public void reorderList(ListNode head) {
        
            ListNode prev = null;
            ListNode curr = head;
            int length = 0;
            
            while(curr != null){
                length++;
                prev = curr;
                curr = curr.next;
            }
            if(length <= 2){
                return;
            }
            int count = length - (length/2); 
            prev = null;
            curr = head;

            int ptr = 0;
            
            while(ptr < count){
                ptr++;
                prev = curr;
                curr = curr.next;
            }
            prev.next = null; 
            
            prev = null;
            ListNode newHead = null;
            while(curr != null){
                newHead = curr;
                curr = curr.next;
                newHead.next = prev;
                prev = newHead;
            }
            
            ListNode newPrev = null;
            ListNode newCurr = newHead;
            prev = null;
            curr = head;
            for(int i = 0; i < length/2; i++){
                prev = curr;
                newPrev = newCurr;
                curr = curr.next;
                newCurr = newCurr.next;
                prev.next = newPrev;
                newPrev.next = curr;      
            }
        }
}