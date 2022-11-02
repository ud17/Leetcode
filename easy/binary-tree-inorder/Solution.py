class Solution:
        
    def traverse(self, root, stack):
        if(root is None): return stack

        self.traverse(root.left, stack)
        stack.append(root.val)
        self.traverse(root.right, stack)
        return stack
    
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        stack = []
        
        return self.traverse(root, stack)