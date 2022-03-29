// Runtime: 3 ms, faster than 72.11% of Java online submissions for Add Two Numbers.
// Memory Usage: 48.6 MB, less than 7.18% of Java online submissions for Add Two Numbers.

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode result = new ListNode(0);
        ListNode node = result;
        
        int carry = 0;        
        while(l1 != null || l2 != null) {
            
            int sum = 0;
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            sum += carry;
            carry = sum/10;
            
            node.next = new ListNode(sum%10);
            node = node.next;
        }
        
        if(carry>0) {
            node.next = new ListNode(carry);
        }
        return result.next;
    }
}