class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        n = len(s)
        res = [float("inf")] * n
        j = -1
        for i in range(n):
            if s[i] == c:
                j = i
            if j != -1:
                res[i] = i - j
        j = -1
        for i in range(n-1, -1, -1):
            if s[i] == c:
                j = i
            if j != -1:
                res[i] = min(res[i], j - i)
        return res