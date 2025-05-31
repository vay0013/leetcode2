class Solution:
    def maxPower(self, s: str) -> int:
        res = 0
        start = 0
        for end in range(len(s)):
            if s[end] != s[start]:
                start = end
            res = max(res, end - start + 1)
        return res