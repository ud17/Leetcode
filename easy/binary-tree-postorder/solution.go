/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
 func postorderTraversal(root *TreeNode) []int {
    var path []int;
    return postorder(root, path);
}

func postorder(node *TreeNode, path []int) []int {
    if node == nil {
        return path;
    }

    path = postorder(node.Left, path);
    path = postorder(node.Right, path);
    path = append(path, node.Val);

    return path;
}