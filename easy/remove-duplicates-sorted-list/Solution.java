public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = head;
        while(head != null) {
            while(head.next != null && head.val == head.next.val) head.next = head.next.next;
            head = head.next;
        }
        return dummy;
    }
}