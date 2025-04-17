class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        if len(mat) == 1:
            return mat[0][0]
        n = len(mat)
        result = 0
        seen = set()
        for i in range(n):
            result += mat[i][i]
            seen.add((i, i))
        for i in range(n):
            if (i, n-i-1) not in seen:
                result += mat[i][n-i-1]
        return result