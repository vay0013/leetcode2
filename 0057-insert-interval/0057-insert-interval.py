class Solution:
    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        if not intervals:
            return [newInterval]
        left, right = 0, len(intervals)-1

        while left <= right:
            mid = left + (right - left) // 2
            if intervals[mid][0] > newInterval[0]:
                right = mid - 1
            else:
                left = mid + 1

        intervals.insert(left, newInterval)
        
        res = [intervals[0]]
        for i in range(1, len(intervals)):
            prev = res[-1]
            cur = intervals[i]
            if cur[0] <= prev[1]:
                prev[1] = max(cur[1], prev[1])
            else:
                res.append(cur)
        return res