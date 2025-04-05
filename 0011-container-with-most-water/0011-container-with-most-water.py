class Solution:
    def maxArea(self, h: List[int]) -> int:
        left = 0
        right = len(h)-1
        result = 0
        while left < right:
            result = max(min(h[left], h[right]) * (right - left), result)
            if h[left] < h[right]:
                left += 1
            else:
                right -= 1
        return result