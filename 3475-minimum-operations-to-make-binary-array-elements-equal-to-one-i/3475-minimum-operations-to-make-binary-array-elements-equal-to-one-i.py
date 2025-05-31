class Solution:
    def minOperations(self, nums: List[int]) -> int:
        res = 0
        for i in range(2, len(nums)):
            if nums[i - 2] == 0:
                nums[i - 2] ^= 1
                nums[i - 1] ^= 1
                nums[i] ^= 1
                res += 1
        if sum(nums) == len(nums):
            return res
        return -1