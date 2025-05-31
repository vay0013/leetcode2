class Solution:
    def pivotInteger(self, n: int) -> int:
        left, right = 1, n
        leftSum = rightSum = 0
        while left <= right:
            if left == right and leftSum == rightSum:
                return left
            if leftSum < rightSum:
                leftSum += left
                left += 1
            else:
                rightSum += right
                right -= 1
        return -1