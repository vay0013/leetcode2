class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        less = []
        equal = []
        great = []
        for i in range(len(nums)):
            if nums[i] > pivot:
                great.append(nums[i])
            elif nums[i] == pivot:
                equal.append(nums[i])
            else:
                less.append(nums[i])
        return less + equal + great