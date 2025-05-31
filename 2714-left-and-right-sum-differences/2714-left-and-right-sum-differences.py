class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        leftSum = sum(nums)
        rightSum = 0
        for i in range(len(nums)):
            rightSum += nums[i]
            res[i] = abs(rightSum - leftSum)
            leftSum -= nums[i]
        return res