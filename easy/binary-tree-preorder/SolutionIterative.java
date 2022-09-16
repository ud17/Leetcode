import java.util.*;;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        if(root == null) return list;
        TreeNode temp = root;
        
        Stack<TreeNode> stack = new Stack<>();
        while(temp != null || !stack.isEmpty()) {
            if(temp != null) {
                list.add(temp.val);
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                temp = temp.right;
            }
        }
        return list;
    }
}