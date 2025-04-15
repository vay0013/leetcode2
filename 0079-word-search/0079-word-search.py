class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        n = len(board)
        m = len(board[0])
        def dfs(word, row, col):
            if len(word) == 0:
                return True
            if row<0 or row>=n or col<0 or col>=m or board[row][col] != word[0]:
                return False
            match = False
            original = board[row][col]
            board[row][col] = "#"
            for dx, dy in (0,1), (1,0), (-1,0), (0,-1):
                x = row + dx
                y = col + dy
                match = match or dfs(word[1:], x, y)
            board[row][col] = original
            return match

        for i in range(n):
            for j in range(m):
                if board[i][j] == word[0] and dfs(word, i, j):
                    return True
        return False