class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        def bt(word, row, col):
            if len(word) == 0:
                return True
            if row<0 or row>=len(board) or col<0 or col>=len(board[0]) or board[row][col]!=word[0]:
                return False
            match = False
            original = board[row][col]
            board[row][col] = "#"
            for dx, dy in (0,1), (1,0), (-1,0), (0,-1):
                x = row + dx
                y = col + dy
                match = match or bt(word[1:], x, y)
            board[row][col] = original
            return match
        for i in range(len(board)):
            for j in range(len(board[i])):
                if board[i][j] == word[0] and bt(word, i, j):
                    return True
        return False