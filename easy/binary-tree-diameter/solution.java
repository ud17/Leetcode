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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverse(root);
        return max;
    }

    public void traverse(TreeNode node) {
        if(node == null) return;

        int leftPath = findMax(node.left);
        int rightPath = findMax(node.right);
        
        if((leftPath + rightPath) > max) {
            max = leftPath + rightPath;
        }

        traverse(node.left);
        traverse(node.right);
    }

    public int findMax(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int left = findMax(node.left);
        int right = findMax(node.right);

        return Math.max(left, right) + 1;
    }
}