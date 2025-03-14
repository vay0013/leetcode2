class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i in range(len(nums)):
            t = target - nums[i]
            if t in hashmap:
                return [hashmap[t], i]
            hashmap[nums[i]] = i
        