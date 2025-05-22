class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if not intervals:
            return [newInterval]
        n = len(intervals)
        left, right = 0, n-1
        while left <= right:
            mid = left + (right - left ) // 2
            if intervals[mid][1] > newInterval[0]:
                right = mid - 1
            else:
                left = mid + 1
        intervals.insert(left, newInterval)
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            cur = intervals[i]
            prev = res[-1]
            if (cur[0] <= prev[1]):
                res[-1][1] = max(cur[1], res[-1][1])
                res[-1][0] = min(cur[0], res[-1][0])
            else:
                res.append(cur)
        return res