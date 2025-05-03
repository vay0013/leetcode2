# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        res = 1
        total = root.val
        q = deque([root])
        lvl = 0
        while q:
            lvl_size = len(q)
            cur_sum = 0
            lvl += 1
            for _ in range(lvl_size):
                n = q.popleft()
                cur_sum += n.val
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)
            if total <= cur_sum:
                res = lvl
                total = cur_sum
        return res