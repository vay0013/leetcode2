class Solution:
    def jump(self, nums: List[int]) -> int:
        result = 0
        l = r = 0
        while r < len(nums)-1:
            farthest = 0
            for i in range(l, r+1):
                farthest = max(farthest, i + nums[i])
            result += 1
            l, r = r+1, farthest
        return result