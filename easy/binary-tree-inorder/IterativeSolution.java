import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> traversal = new ArrayList<>();
        
        return inorderIterative(root, traversal);
    }
    
    private List<Integer> inorderIterative(TreeNode root, List<Integer> list) {
        if(root == null) return list;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        
        while(!stack.isEmpty() || temp != null) {
            
            if(temp!=null) {
                stack.push(temp);
                // explore left sub tree
                temp = temp.left;
            } else {
                // traverse back to parent node
                temp = stack.pop();
                list.add(temp.val);
                // explore right sub tree
                temp = temp.right;
            }
        }
        return list;
    }
}
