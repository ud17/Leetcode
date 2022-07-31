public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        
        ListNode dummy = prev;
        
        while(prev.next != null) {
            if(prev.next.next != null && prev.next.val == prev.next.next.val) {
                while(prev.next.next != null && prev.next.val == prev.next.next.val) prev.next = prev.next.next;
                prev.next = prev.next.next;
            } else prev = prev.next;
        }
        
        return dummy.next;
    }
}