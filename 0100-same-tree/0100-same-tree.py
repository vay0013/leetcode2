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
            lvl_size = len(qu)//2
            for _ in range(lvl_size):
                node1 = qu.popleft()
                node2 = qu.popleft()
                if not node1 and not node2:
                    continue
                if not node1 or not node2 or node1.val != node2.val:
                    return False
                qu.append(node1.left)
                qu.append(node2.left)
                qu.append(node1.right)
                qu.append(node2.right)
        return True