class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        vote = 0
        cur = nums[0]
        for c in nums:
            if vote == 0:
                cur = c 
            if cur == c:
                vote += 1
            else:
                vote -= 1
        return cur
            