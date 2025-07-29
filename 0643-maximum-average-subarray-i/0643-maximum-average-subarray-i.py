class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        res = float('-inf')
        cur = 0
        start = 0
        for end in range(len(nums)):
            cur += nums[end]
            if end - start + 1 == k:
                res = max(res, cur)
                cur -= nums[start]
                start += 1
        return res / k