public class SolutionTwo {
            
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode result = new ListNode(0);
        ListNode node = result;
        List<Integer> list = new ArrayList<>();

        while(list1 != null || list2 != null) {
            
            if(list1 != null) {
                list.add(list1.val);
                list1 = list1.next;
            }
            
            if(list2 != null) {
                list.add(list2.val);
                list2 = list2.next;
            }
        }
        
        Collections.sort(list);
        
        for(int n: list) {
            
            node.next = new ListNode(n);
            
            node = node.next;
        }
        
        return result.next;
    }
}
