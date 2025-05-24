class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        res = 0
        for i in range(2, len(nums)):
            if nums[i-2] + nums[i] == nums[i-1] // 2 and nums[i-1] % 2 == 0:
                res += 1
        return res