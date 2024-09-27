/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func inorderTraversal(root *TreeNode) []int {
    var path []int;

    return inorder(root, path);
}

func inorder(node *TreeNode, path []int) []int {
    if node == nil {
        return path;
    }

    path = inorder(node.Left, path);
    path = append(path, node.Val);
    path = inorder(node.Right, path);

    return path;
}