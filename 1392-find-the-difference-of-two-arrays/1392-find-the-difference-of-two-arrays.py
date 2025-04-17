class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        arr = (set(nums1), set(nums2))
        result  = [[], []]
        for i in arr[0]:
            if i not in arr[1]:
                result[0].append(i)
        for i in arr[1]:
            if i not in arr[0]:
                result[1].append(i)
        return result