# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        stack = [p, q]
        while stack:
            nl = stack.pop()
            nr = stack.pop()
            if not nl and not nr:
                continue
            if not nl or not nr or nl.val != nr.val:
                return False
            stack.append(nl.left)
            stack.append(nr.left)
            stack.append(nl.right)
            stack.append(nr.right)
        return True