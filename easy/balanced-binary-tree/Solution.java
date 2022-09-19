class Solution {
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        
        compareHeight(root);
        return balanced;
    }
    
    private int compareHeight(TreeNode root) {
        if(root == null) return 0;
        
        int left = compareHeight(root.left);
        int right = compareHeight(root.right);
        
        if(Math.abs(left - right) > 1) balanced = false;
        return Math.max(left, right) + 1;
    }
}