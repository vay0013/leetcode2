class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        left_sum, right_sum = 0, sum(nums)
        n = len(nums)
        res = [0] * n
        for i in range(n):
            right_sum -= nums[i]
            res[i] = abs(left_sum - right_sum)
            left_sum += nums[i]
        return res