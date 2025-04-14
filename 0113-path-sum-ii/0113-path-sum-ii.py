# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        result = []
        def dfs(node, path, acc):
            if not node:
                return
            path += node.val
            acc.append(node.val)
            if not node.left and not node.right and path == targetSum:
                result.append(acc[:])
            dfs(node.left, path, acc)
            dfs(node.right, path, acc)
            acc.pop()
        dfs(root, 0, [])
        return result