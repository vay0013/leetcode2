class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        def bt(acc, seen):
            if len(acc) == len(nums):
                result.append(acc[:])
            for i in range(len(nums)):
                if nums[i] not in seen:
                    acc.append(nums[i])
                    seen.add(nums[i])
                    bt(acc, seen)
                    acc.remove(nums[i])
                    seen.remove(nums[i])
        bt([], set())
        return result