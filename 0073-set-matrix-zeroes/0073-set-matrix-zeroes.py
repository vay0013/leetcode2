class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        n = len(matrix)
        m = len(matrix[0])
        q = deque()
        for i in range(n):
            for j in range(m):
                if matrix[i][j] == 0:
                    q.append((i, j))
        while q:
            x, y = q.popleft()
            for i in range(m):
                matrix[x][i] = 0
            for i in range(n):
                matrix[i][y] = 0
        