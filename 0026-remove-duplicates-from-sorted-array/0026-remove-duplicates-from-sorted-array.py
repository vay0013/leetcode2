class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        start = 0
        for end in range(len(nums)):
            if nums[end] != nums[start]:
                start += 1
                nums[start] = nums[end]
        return start+1