class Solution:
    def trap(self, h: List[int]) -> int:
        stack = []
        res = 0
        for i in range(len(h)):
            while stack and h[stack[-1]] < h[i]:
                cur = stack.pop()
                if not stack:
                    break
                prev = stack[-1]
                res += (min(h[i], h[prev]) - h[cur]) * (i - prev - 1)
            stack.append(i)
        return res