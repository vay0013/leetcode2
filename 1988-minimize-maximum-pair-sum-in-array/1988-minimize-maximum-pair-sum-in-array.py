class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        left = 0
        right = len(nums) - 1
        res = 0
        while left < right:
            res = max(res, nums[right] + nums[left])
            right -= 1
            left += 1
        return res