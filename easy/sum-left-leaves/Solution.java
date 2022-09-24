public class Solution {
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        
        traverseLeftNodeAndAdd(root);
        return sum;
    }
    
    private void traverseLeftNodeAndAdd(TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                if(root.left.left == null && root.left.right == null) sum += root.left.val;
                else sumOfLeftLeaves(root.left);
            }
            if(root.right != null) sumOfLeftLeaves(root.right);
        }
    }
}