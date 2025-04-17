class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left_sum = [0] * n
        right_sum = [0] * n
        prefix = 0
        suffix = 0
        for i in range(n):
            prefix += nums[i]
            left_sum[i] = prefix
        for i in range(n-1, -1, -1):
            suffix += nums[i]
            right_sum[i] = suffix
        result = [0] * n
        for i in range(n):
            result[i] = abs(left_sum[i] - right_sum[i])
        return result
