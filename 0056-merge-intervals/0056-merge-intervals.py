class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            cur = intervals[i]
            prev = res[-1]
            if cur[0] <= prev[1]:
                res[-1][1] = max(cur[1], prev[1])
            else:
                res.append(cur)
        return res