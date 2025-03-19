class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        if m * n != len(original):
            return []
        result = [[0] * n for _ in range(m)]
        counter = 0
        for row in range(m):
            for column in range(n):
                result[row][column] = original[counter]
                counter+=1 
        return result