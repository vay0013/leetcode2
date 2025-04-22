class Solution:
    def intervalIntersection(self, f: List[List[int]], s: List[List[int]]) -> List[List[int]]:
        res = []
        i = j = 0
        while i < len(f) and j < len(s):
            start = max(f[i][0], s[j][0])
            end = min(f[i][1], s[j][1])
            if start <= end:
                res.append([start, end])
            if f[i][1] < s[j][1]:
                i += 1
            else:
                j += 1
        return res