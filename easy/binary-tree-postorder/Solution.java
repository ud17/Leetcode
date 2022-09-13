import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> traversal = new ArrayList<>();
        
        return postorderRecursive(root, traversal);
    }
    
    private List<Integer> postorderRecursive(TreeNode root, List<Integer> list) {
        if(root == null) return list;

        postorderRecursive(root.left, list);
        postorderRecursive(root.right, list);
        list.add(root.val);
        return list;
    }
}
