import java.util.*;;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> traversal = new ArrayList<>();
        
        return findList(root, traversal);
    }
    
    private List<Integer> findList(TreeNode root, List<Integer> list) {
        // base case
        if(root == null) return list;
        
        // traverse left sub tree
        findList(root.left, list);        
        list.add(root.val);
        
        // explore right sub tree
        findList(root.right, list);
        return list;
    }
}