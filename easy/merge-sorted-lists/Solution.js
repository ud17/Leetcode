/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
 var mergeTwoLists = function(list1, list2) {
    let node = new ListNode(-1);
    let res = node;

    while(list1 != null || list2 != null) {
        
        let l1 = 101;
        let l2 = 101;
        let val;

        if(list1 != null) {
            l1 = list1.val;
        }

        if(list2 != null) {
            l2 = list2.val;
        }

        if(l1 > l2) {
            if(list2 != null) list2 = list2.next;
            val = l2;
        } else {
            if(list1 != null) list1 = list1.next;
            val = l1;
        }

        node.next = new ListNode(val);
        node = node.next;
    }
    return res.next;
};