/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func sortedArrayToBST(nums []int) *TreeNode {
    return generateBST(nums, 0, len(nums) - 1);
}

func generateBST(nums []int, start, end int) *TreeNode {
    if start > end {
        return nil;
    }

    mid := (start+end)/2;

    var node TreeNode;

    node.Val = nums[mid];
    node.Left = generateBST(nums, start, mid - 1);
    node.Right = generateBST(nums, mid + 1, end);

    return &node;
}