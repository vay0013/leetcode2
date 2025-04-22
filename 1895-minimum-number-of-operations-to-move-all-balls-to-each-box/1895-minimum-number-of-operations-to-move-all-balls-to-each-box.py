class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        balls_left = 0
        balls_right = 0

        moves_left = 0
        moves_right = 0

        n = len(boxes)
        res = [0] * n

        for i in range(n):
            res[i] += moves_left
            balls_left += int(boxes[i])
            moves_left += balls_left

            j = n - i - 1
            res[j] += moves_right
            balls_right += int(boxes[j])
            moves_right += balls_right
        return res