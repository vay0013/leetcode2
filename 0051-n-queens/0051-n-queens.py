class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        res = []
        def bt(acc, colmns, row, diagonals, t_diagonals):
            if row == n:
                res.append(["".join(acc[i]) for i in range(n)])
            for col in range(n):
                diagonal = row + col
                t_diagonal = n + row - col
                if col in colmns or diagonal in diagonals or t_diagonal in t_diagonals:
                    continue
                acc[row][col] = "Q"
                colmns.add(col)
                diagonals.add(diagonal)
                t_diagonals.add(t_diagonal)

                bt(acc, colmns, row+1, diagonals, t_diagonals)

                acc[row][col] = "."
                colmns.remove(col)
                diagonals.remove(diagonal)
                t_diagonals.remove(t_diagonal)
            
        acc = [["."] * n for _ in range(n)]
        bt(acc, set(), 0, set(), set())
        return res