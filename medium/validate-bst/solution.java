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

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = findValid(root, list);
        return isSorted(list);
    }

    public List<Integer> findValid(TreeNode node, List<Integer> list) {
        if(node == null) {
            return list;
        }

        findValid(node.left, list);
        list.add(node.val);
        findValid(node.right, list);

        return list;
    }

    public boolean isSorted(List<Integer> list) {
        for(int i=0; i<list.size()-1; i++) {
            if(list.get(i) >= list.get(i+1)) return false;
        }
        return true;
    }
}