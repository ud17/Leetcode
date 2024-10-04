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

    boolean isValid = true;
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        findValid(root, list);
        return isValid;
    }

    public List<Integer> findValid(TreeNode node, List<Integer> list) {
        if(node == null) {
            return list;
        }

        findValid(node.left, list);
        if(!list.isEmpty() && node.val <= list.get(list.size()-1)) {
            isValid = false;
        }
        list.add(node.val);
        findValid(node.right, list);

        return list;
    }
}