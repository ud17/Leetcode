public class MyHashSet {

    ListNode head = null;
    
    public MyHashSet() {
        head = new ListNode(Integer.MAX_VALUE);
    }
    
    public void add(int key) {
        ListNode pointer = head;
        if(!contains(key)) {
            while(pointer.next!=null) {
                pointer = pointer.next;
            }
            pointer.next = new ListNode(key);
        }
    }
    
    public void remove(int key) {
        ListNode pointer = new ListNode(0);
        pointer.next = head;
        while(pointer.next!=null) {
            if(pointer.next.val == key) pointer.next = pointer.next.next;
            else pointer = pointer.next;
        }
    }
    
    public boolean contains(int key) {
        ListNode pointer = head;
        while(pointer!=null) {
            if(pointer.val == key) return true;
            pointer = pointer.next;
        }
        return false;
    }
}