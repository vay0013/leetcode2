class Solution:
    def minOperations(self, nums: List[int]) -> int:
        res = 0
        for i in range(2, len(nums)):
            if nums[i-2] == 0:
                res += 1
                nums[i-2] = nums[i-2] ^ 1
                nums[i-1] = nums[i-1] ^ 1
                nums[i] = nums[i] ^ 1
        if sum(nums) == len(nums):
            return res
        return -1