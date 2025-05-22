class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort()
        res = 0
        arr = [intervals[0]]
        for i in range(1, len(intervals)):
            prev = arr[-1]
            cur = intervals[i]
            if prev[1] > cur[0]:
                res+=1
            else:
                arr.append(cur)
        return res
        