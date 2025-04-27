class Solution:
    def updateMatrix(self, mat: List[List[int]]) -> List[List[int]]:
        n = len(mat)
        m = len(mat[0])
        q = deque()
        seen = set()
        for i in range(n):
            for j in range(m):
                if mat[i][j] == 0:
                    q.append((i, j, 1))
                    seen.add((i, j))
        while q:
            r, c, d = q.popleft()
            for dx, dy in (0, 1), (1, 0), (-1, 0), (0, -1):
                x, y = r + dx, c + dy
                if 0<=x<n and 0<=y<m and (x, y) not in seen:
                    mat[x][y] = d
                    q.append((x, y, d+1))
                    seen.add((x, y))
        return mat