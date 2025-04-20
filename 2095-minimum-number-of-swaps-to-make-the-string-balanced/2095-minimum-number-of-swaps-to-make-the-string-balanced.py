class Solution:
    def minSwaps(self, s: str) -> int:
        res = 0
        stack = []
        for c in s:
            if c == '[':
                stack.append(c)
            else:
                if stack:
                    stack.pop()
                else:
                    res += 1
        return (res + 1) // 2