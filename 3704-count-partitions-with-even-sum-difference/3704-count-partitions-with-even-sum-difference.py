class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        left, right = 0, sum(nums)
        res = 0
        for i in range(len(nums)-1):
            left += nums[i]
            right -= nums[i]
            if (left - right) % 2 == 0:
                res += 1
        return res