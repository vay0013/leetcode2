class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        n = len(mat)
        result = 0
        for i in range(n):
            result += mat[i][i]
            result += mat[i][n-i-1]
        if n % 2 != 0:
            result -= mat[n//2][n//2]
        return result