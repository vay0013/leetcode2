class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        n = len(grid)
        m = len(grid[0])
        seen = set()
        res = 0
        q = deque()
        for i in range(n):
            for j in range(m):
                if grid[i][j] == "1" and (i, j) not in seen:
                    res += 1
                    q.append((i, j))
                    while q:
                        row, col = q.popleft()
                        for dx, dy in (1, 0), (0, 1), (-1, 0), (0, -1):
                            x, y = row + dx, col + dy
                            if (0<=x<n and 0<=y<m and (x, y) not in seen and grid[x][y] == "1"):
                                q.append((x, y))
                                seen.add((x, y))
        return res