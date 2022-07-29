public class SolutionTwo {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next == null) return head;
        
        ListNode prev = null;
        ListNode curr = head;
        int idx=0;
        
        while(curr.next != null && idx < 1) {
            prev = curr.next;
            curr.next = curr.next.next;
            prev.next = curr;
            idx++;
        }
        
        head.next = swapPairs(head.next);
        return prev;
    }
}