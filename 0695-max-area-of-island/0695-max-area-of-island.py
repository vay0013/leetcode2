class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        n = len(grid)
        m = len(grid[0])
        res = 0
        seen = set()
        q = deque()
        for i in range(n):
            for j in range(m):
                if (grid[i][j] == 1 and (i, j) not in seen):
                    count = 1
                    q.append((i, j))
                    seen.add((i, j))
                    while q:
                        row, col = q.popleft()
                        for dx, dy in (1, 0), (0, 1), (-1, 0), (0, -1):
                            x, y = row + dx, col + dy
                            if 0<=x<n and 0<=y<m and (x, y) not in seen and grid[x][y] == 1:
                                seen.add((x, y))
                                q.append((x, y))
                                count += 1
                    res = max(res, count)
        return res