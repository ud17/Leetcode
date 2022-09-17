import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SolutionIterative {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> traversal = new ArrayList<>();
        
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        
        while(current != null || !stack.isEmpty()) {
            if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if(temp == null) {
                    temp = stack.pop();
                    traversal.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        traversal.add(temp.val);
                    }
                } else {
                    current = temp;
                }
            }
        }
        return traversal;
    }
}