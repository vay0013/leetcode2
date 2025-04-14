class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = set()
        nums.sort()
        n = len(nums)
        for i in range(n):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            left = i+1
            right = n - 1
            while left < right:
                cur = nums[left] + nums[right]
                if cur == -nums[i]:
                    result.add((nums[i], nums[left], nums[right]))
                if cur > -nums[i]:
                    right -= 1
                else:
                    left += 1
        return list(result)