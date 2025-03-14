class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        begin = 0
        end = n-1
        for i in range(n-1, -1, -1):
            if abs(nums[end]) > abs(nums[begin]):
                result[i] = nums[end] * nums[end]
                end -= 1
            else:
                result[i] = nums[begin] * nums[begin]
                begin += 1
        return result