class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        left_sum = 0
        for i in range(n):
            left_sum += nums[i]
            result[i] = left_sum
        return result