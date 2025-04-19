class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        less = 0
        equal = 0
        for num in nums:
            if num == pivot:
                equal += 1
            elif num < pivot:
                less += 1
        ans = [0] * len(nums)
        lessI = 0
        equalI = less
        greaterI = less + equal
        for i in range(len(nums)):
            if nums[i] > pivot:
                ans[greaterI] = nums[i]
                greaterI += 1
            elif nums[i] == pivot:
                ans[equalI] = nums[i]
                equalI += 1
            elif nums[i] < pivot:
                ans[lessI] = nums[i]
                lessI += 1
        return ans