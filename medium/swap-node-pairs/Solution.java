public class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode first = head;
        ListNode second = head != null ? head.next : null;
        while(second != null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
            if(first.next.next!=null){
                first = first.next.next;
                second = second.next.next;
            }else
                break;
        }
        return head;
    }
}