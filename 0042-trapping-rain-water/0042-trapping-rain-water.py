class Solution:
    def trap(self, h: List[int]) -> int:
        left = 0
        leftMax = h[left]
        right = len(h) - 1
        rightMax = h[right]
        result = 0
        while left < right:
            if h[left] < h[right]:
                left += 1
                leftMax = max(leftMax, h[left])
                result += leftMax - h[left]
            else:
                right -= 1
                rightMax = max(rightMax, h[right])
                result += rightMax - h[right]
        return result