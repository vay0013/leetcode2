class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n
        left = 0
        right = n-1
        for i in range(n-1, -1, -1):
            cur = 0
            if nums[left]**2 > nums[right]**2:
                res[i] = nums[left]**2
                left += 1
            else:
                res[i] = nums[right]**2
                right -= 1
        return res