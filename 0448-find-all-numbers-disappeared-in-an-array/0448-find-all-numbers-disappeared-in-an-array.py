class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        being = 0
        while being != len(nums):
            pos = nums[being]-1
            if nums[being] != nums[pos]:
                nums[being], nums[pos] = nums[pos], nums[being]
            else:
                being += 1
        result = []
        for i in range(len(nums)):
            if nums[i] != i+1:
                result.append(i+1)
        return result