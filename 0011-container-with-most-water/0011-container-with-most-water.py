class Solution:
    def maxArea(self, h: List[int]) -> int:
        res = 0
        left = 0
        right = len(h) - 1
        while left < right:
            v = min(h[left], h[right]) * (right - left)
            res = max(res, v)
            if h[left] < h[right]:
                left += 1
            else:
                right -= 1
        return res