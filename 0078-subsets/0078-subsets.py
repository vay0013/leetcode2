class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        def bt(acc, start):
            if len(acc) > len(nums):
                return
            result.append(acc[:])
            for i in range(start, len(nums)):
                acc.append(nums[i])
                bt(acc, i+1)
                acc.remove(nums[i])
        bt([], 0)
        return result