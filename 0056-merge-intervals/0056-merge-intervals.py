class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            prev = res[-1]
            cur = intervals[i]
            if cur[0] <= prev[1]:
                res[-1][1] = max(res[-1][1], cur[1])
            else:
                res.append(cur) 
        return res
