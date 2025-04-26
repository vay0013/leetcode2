class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:

        
        n = len(grid)
        m = len(grid[0])
        res = 0
        seen = set()
        def bfs(row, col):
            if not (0<=row<n and 0<=col<m and grid[row][col] and (row, col) not in seen):
                return 0
            seen.add((row, col))
            return 1 + bfs(row+1, col) + bfs(row, col+1) + bfs(row-1, col) + bfs(row, col-1)

        for i in range(n):
            for j in range(m):
                if (grid[i][j] == 1):
                    res = max(bfs(i, j), res)
        
        return res