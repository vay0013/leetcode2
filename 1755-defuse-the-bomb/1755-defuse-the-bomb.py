class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        n = len(code)
        res = [0] * n
        if k == 0:
            return res
        start, end, window = 1, k, 0
        if k < 0:
            start = n - abs(k)
            end = n - 1
        for i in range(start, end + 1):
            window += code[i]
        for i in range(n):
            res[i] = window
            window -= code[start % n]
            window += code[(end + 1) % n]
            start += 1
            end += 1
        return res