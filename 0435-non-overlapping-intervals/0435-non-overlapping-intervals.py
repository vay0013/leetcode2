class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x: x[1])
        res = 0
        prev_end = intervals[0][1]
        for i in range(1, len(intervals)):
            cur = intervals[i]
            if prev_end > cur[0]:
                res+=1
            else:
                prev_end = cur[1]
        return res
        