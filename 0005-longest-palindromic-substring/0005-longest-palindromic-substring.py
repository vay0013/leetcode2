class Solution:
    def longestPalindrome(self, s: str) -> str:
        def expand(l, r):
            while l >= 0 and r < len(s) and s[l] == s[r]:
                l -= 1
                r += 1
            return r - l - 1
        res = [0, 0]
        for i in range(len(s)-1):
            odd_len = expand(i, i)
            if res[1] - res[0] + 1 < odd_len:
                dist = odd_len // 2
                res = [i - dist, i + dist]

            even_len = expand(i, i+1)
            if res[1] - res[0] + 1 < even_len:
                dist = even_len // 2 - 1
                res = [i - dist, i + dist + 1]
        return s[res[0] : res[1] + 1]