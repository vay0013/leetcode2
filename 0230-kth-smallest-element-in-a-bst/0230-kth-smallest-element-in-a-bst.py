# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        min_heap = []
        
        q = deque([root])
        while q:
            node = q.popleft()
            heappush(min_heap, node.val)
            if node.left:
                q.append(node.left)
            if node.right:
                q.append(node.right)
        result = float("inf")
        for _ in range(k):
            result = heappop(min_heap)
        return result