class Solution:
    def longestPalindrome(self, s: str) -> str:
        def expand(p1, p2):
            while p1 >= 0 and p2 < len(s) and s[p1] == s[p2]:
                p1 -= 1
                p2 += 1
            return p2 - p1 - 1

        res = [0, 0]

        for i in range(len(s)-1):
            odd_len = expand(i, i)
            if odd_len > res[1] - res[0] + 1:
                dist = odd_len // 2
                res = [i - dist, i + dist]
    
            even_len = expand(i, i+1)
            if even_len > res[1] - res[0] + 1:
                dist = even_len // 2 - 1
                res = [i - dist, i + 1 + dist]
        return s[res[0] : res[1] + 1]