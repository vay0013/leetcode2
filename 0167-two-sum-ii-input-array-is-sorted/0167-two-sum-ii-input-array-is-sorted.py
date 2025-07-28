class Solution:
    def twoSum(self, n: List[int], target: int) -> List[int]:
        left = 0
        right = len(n)-1
        while left < right:
            if n[left] + n[right] == target:
                return [left+1, right+1]
            if n[left] + n[right] > target:
                right -= 1
            else:
                left += 1
        return [-1, -1]