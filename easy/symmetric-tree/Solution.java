public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }
    public boolean helper(TreeNode l, TreeNode r) {
        if(l == null || r == null) return l == r;
        return !(l.val != r.val || !helper(l.left, r.right) || !helper(l.right, r.left));
    }
}