class Solution:
    def canJump(self, nums: List[int]) -> bool:
        farthest = nums[0]
        for i in range(len(nums)):
            farthest = max(farthest, i + nums[i])
            if farthest >= len(nums)-1:
                return True
            if farthest == i:
                return False
        return True