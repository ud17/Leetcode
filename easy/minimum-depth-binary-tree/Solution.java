class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if(root.left == null || root.right == null)
            return Math.max(left, right) + 1;
        else
            return Math.min(left, right) + 1;
    }
}