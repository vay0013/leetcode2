class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0
        n = len(grid)
        m = len(grid[0])
        result = 0
        seen = set()
        def is_valid(x, y):
            return 0<=x<n and 0<=y<m and grid[x][y] == "1"
        q = deque([])
        for i in range(n):
            for j in range(m):
                if (i, j) in seen:
                    continue
                if grid[i][j] == "1":
                    result += 1
                    q.append((i, j))
                    while q:
                        x, y = q.popleft()
                        if is_valid(x, y):
                            grid[x][y] = "0"
                            for dx, dy in [(0,1),(1,0),(0,-1),(-1,0)]:
                                new_x = dx+x
                                new_y = dy+y
                                q.append((new_x, new_y))
                                seen.add((new_x, new_y))

        return result
