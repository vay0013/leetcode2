class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        vote = 0
        result = nums[0]
        for num in nums:
            if vote == 0:
                result = num
            if num == result:
                vote += 1
            else:
                vote -= 1
        return result    