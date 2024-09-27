/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func preorderTraversal(root *TreeNode) []int {
    var path []int;
    return preorder(root, path);
}

func preorder(node *TreeNode, path []int) []int {
    if node == nil {
        return path;
    }

    path = append(path, node.Val);
    path = preorder(node.Left, path);
    path = preorder(node.Right, path);

    return path;
}