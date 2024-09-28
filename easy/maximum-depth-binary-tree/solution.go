/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func maxDepth(root *TreeNode) int {
    if root == nil {
        return 0;
    }
    
    n1 := maxDepth(root.Left);
    n2 := maxDepth(root.Right);

    return Max(n1, n2) + 1;
}

func Max(n1, n2 int) int {
    if n1 > n2 {
        return n1;
    }
    return n2;
}