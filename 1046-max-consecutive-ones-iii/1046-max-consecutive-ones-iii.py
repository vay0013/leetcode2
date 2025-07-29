class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        res = 0
        skip = 0
        start = 0
        for end in range(len(nums)):
            if nums[end] == 0:
                skip += 1
            while skip > k:
                if nums[start] == 0:
                    skip -= 1
                start += 1
            res = max(res, end - start + 1)
        return res