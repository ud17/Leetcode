import java.util.*;;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        return preorderRecursive(root, list);
    }
    
    private List<Integer> preorderRecursive(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        
        list.add(root.val);
        preorderRecursive(root.left, list);
        preorderRecursive(root.right, list);
        
        return list;
    }
}