class Solution:
    def pivotInteger(self, n: int) -> int:
        left, right = 1, n
        left_sum, right_sum = 0, 0
        while left <= right:
            if left == right and left_sum == right_sum:
                return left
            if left_sum > right_sum:
                right_sum += right
                right -= 1
            else:
                left_sum += left
                left += 1
        return -1