# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False
        stack = [(root, targetSum)]
        while stack:
            node, path = stack.pop()
            if not node.left and not node.right and path - node.val == 0:
                return True
            if node.left:
                stack.append((node.left, path - node.val))
            if node.right:
                stack.append((node.right, path - node.val))
        return False
