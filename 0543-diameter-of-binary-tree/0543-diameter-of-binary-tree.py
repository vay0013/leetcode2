# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        if not root:
            return 0
        def find_max_depth(root):   
            if not root:
                return 0
            stack = [(root, 1)]
            result = 0
            while stack:
                node, depth = stack.pop()
                if not node.left and not node.right:
                    result = max(result, depth)
                if node.left:
                    stack.append((node.left, depth + 1))
                if node.right:
                    stack.append((node.right, depth + 1))
            return result
        return find_max_depth(root.left) + find_max_depth(root.right)