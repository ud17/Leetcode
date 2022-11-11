public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return generateBinaryTree(nums, 0, nums.length-1);
    }
    
    private TreeNode generateBinaryTree(int[] arr, int left, int right) {
        // base condition
        if(left > right) return null;
        
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        
        node.left = generateBinaryTree(arr, left , mid-1);
        node.right = generateBinaryTree(arr, mid+1, right);
        return node;
    }
}