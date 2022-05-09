// Runtime: 1 ms, faster than 65.73% of Java online submissions for Merge Two Sorted Lists.
// Memory Usage: 43.8 MB, less than 5.76% of Java online submissions for Merge Two Sorted Lists.

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode(0);
        ListNode node = result;

        while(list1 != null || list2 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(list2.val < list1.val) {
                        node.next = new ListNode(list2.val);
                        list2 = list2.next;
                    } else {
                        node.next = new ListNode(list1.val);
                        list1 = list1.next;
                    }
                } else {
                    node.next = new ListNode(list1.val);
                    list1 = list1.next;
                }
            } 
            else if(list2 != null) {
                node.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            node = node.next;
        }
        
        return result.next;
    }
}