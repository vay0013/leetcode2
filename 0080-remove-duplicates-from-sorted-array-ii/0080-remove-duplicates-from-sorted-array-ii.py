class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        result = 2
        for i in range(2, len(nums)):
            if nums[i] != nums[result - 2]:
                nums[result] = nums[i]
                result += 1
        return result