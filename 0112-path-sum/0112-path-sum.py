# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], target: int) -> bool:
        if not root:
            return False
        stack = [(root, target)]
        while stack:
            node, n = stack.pop()
            if not node.left and not node.right and node.val - n == 0:
                return True
            if node.right:
                stack.append((node.right, n - node.val))
            if node.left:
                stack.append((node.left, n - node.val))
        return False