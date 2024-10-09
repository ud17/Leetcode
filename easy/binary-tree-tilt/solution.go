/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

 func findTilt(root *TreeNode) int {
    var tilt int
    traverse(root, &tilt)
    return tilt;
}

func traverse(root *TreeNode, tilt *int) int {
    if root == nil {
        return 0
    }

    left := traverse(root.Left, tilt)
    right := traverse(root.Right, tilt)

    *tilt += int(math.Abs(float64(left) - float64(right)));

    return root.Val + left + right;
}