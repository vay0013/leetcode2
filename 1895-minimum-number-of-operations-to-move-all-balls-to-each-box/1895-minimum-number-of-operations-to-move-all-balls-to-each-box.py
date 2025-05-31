class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        res = [0] * len(boxes)
        leftBalls = 0
        movesLeft = 0
        rightBalls = 0
        movesRight = 0
        for i in range(len(boxes)):
            res[i] += movesLeft
            leftBalls += int(boxes[i])
            movesLeft += leftBalls

            j = len(boxes) - i - 1
            res[j] += movesRight
            rightBalls += int(boxes[j])
            movesRight += rightBalls
        return res