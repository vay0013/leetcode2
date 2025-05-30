class Solution:
    def intervalIntersection(self, f: List[List[int]], s: List[List[int]]) -> List[List[int]]:
        res = []
        p1, p2 = 0, 0
        while p1 < len(f) and p2 < len(s):
            cur = [0, 0]
            cur[0] = max(f[p1][0], s[p2][0])
            cur[1] = min(f[p1][1], s[p2][1])
            if cur[0] <= cur[1]:
                res.append(cur)
            if cur[1] == f[p1][1]:
                p1 += 1
            else:
                p2 += 1
        return res