class Solution:
    def subarraySum(self, nums: List[int]) -> int:
        n = len(nums)
        result = nums[0]
        prefix_sum = [0] * (n+1)
        for i in range(1, n+1):
            prefix_sum[i] = prefix_sum[i-1] + nums[i-1]
        for i in range(1, n):
            start = max(0, i - nums[i])
            result += prefix_sum[i+1] - prefix_sum[start]
        return result       