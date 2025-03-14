# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        qu = deque([p, q])
        while qu:
            size = len(qu) // 2
            for _ in range(size):
                p_node = qu.popleft()
                q_node = qu.popleft()
                if not p_node and not q_node:
                    continue
                if not p_node or not q_node or p_node.val != q_node.val:
                    return False
                qu.append(p_node.left)
                qu.append(q_node.left)
                qu.append(p_node.right)
                qu.append(q_node.right)
        return True
        