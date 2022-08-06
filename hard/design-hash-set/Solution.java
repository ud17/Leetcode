public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        
        for(ListNode list: lists) {
            while(list != null) {
                head.next = new ListNode(list.val);
                head = head.next;
                list = list.next;
            }
        }
        
        return mergeSort(dummy.next);
    }
    
    private static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head); // apply merge sort on left half
        ListNode right = mergeSort(nextOfMiddle); // apply merge sort on righ half
        return mergeTwoNode(left, right);
    }
    
    private static ListNode mergeTwoNode(ListNode a, ListNode b) {
        ListNode result = null;
        // base cases
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val <= b.val) {
            result = a;
            result.next = mergeTwoNode(a.next, b);
        } else {
            result = b;
            result.next = mergeTwoNode(a, b.next);
        }
        return result;
    }
    
    private static ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        } 
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}