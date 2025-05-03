# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        res = 0
        stack = [(root, root.val)]
        while stack:
            node, num = stack.pop()
            if node.val >= num:
                res+=1
            num = max(num, node.val)
            if node.left:
                stack.append((node.left, num))
            if node.right:
                stack.append((node.right, num))
        return res