class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        result = float("-inf")
        cur = 0
        start = 0
        for i in range(len(nums)):
            cur += nums[i]
            if i - start + 1 == k:
                result = max(result, cur)
                cur -= nums[start]
                start += 1
        return result / k