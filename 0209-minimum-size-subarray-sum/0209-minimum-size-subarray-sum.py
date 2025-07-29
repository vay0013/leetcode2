class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        res = float('inf')
        cur = 0
        start = 0
        for end in range(len(nums)):
            cur += nums[end]
            while cur >= target:
                res = min(res, end - start + 1)
                cur -= nums[start]
                start += 1
        if res == float('inf'):
            return 0
        return res