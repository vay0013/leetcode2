class Solution:
    def minOperations(self, boxes: str) -> List[int]:
        n = len(boxes)
        result = [0] * n
        for i in range(n):
            if boxes[i] == "1":
                for j in range(n):
                    result[j] += abs(j - i)
        return result 