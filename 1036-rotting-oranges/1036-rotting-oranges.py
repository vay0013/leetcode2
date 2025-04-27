class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        q = deque()
        oranges = 0
        for i in range(n):
            for j in range(m):
                if grid[i][j] == 1:
                    oranges += 1
                if grid[i][j] == 2:
                    q.append((i, j, 0))
        res = 0
        while q:
            r, c, t = q.popleft()
            res = max(res, t)
            for dx, dy in (0, 1), (1, 0), (0, -1), (-1, 0):
                x, y = r + dx, c + dy
                if 0<=x<n and 0<=y<m and grid[x][y] == 1:
                    grid[x][y] = 2
                    q.append((x, y, t+1))
                    oranges -= 1
        if oranges == 0:
            return res
        return -1