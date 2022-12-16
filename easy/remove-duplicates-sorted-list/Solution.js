/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
 var deleteDuplicates = function(head) {

    if(head == undefined) return head;

    var node = head;
    while(head.next != undefined) {
        if(head.val == head.next.val) {
            head.next = head.next.next;
        } else {
            head = head.next;
        }
    }

    return node;
};