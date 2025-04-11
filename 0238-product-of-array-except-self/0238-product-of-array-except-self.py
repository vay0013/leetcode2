class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        prefix = 1
        suffix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]
        for i in range(n-1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]
        return result