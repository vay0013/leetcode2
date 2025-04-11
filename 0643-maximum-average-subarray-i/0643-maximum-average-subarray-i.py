class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        result = float("-inf")
        start = 0
        cur = 0
        for end in range(len(nums)):
            cur += nums[end]
            if end - start + 1 == k:
                result = max(result, cur)
                cur -= nums[start]
                start += 1
        return result / k