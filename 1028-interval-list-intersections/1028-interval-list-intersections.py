class Solution:
    def intervalIntersection(self, fl: List[List[int]], sl: List[List[int]]) -> List[List[int]]:
        res = []
        l1 = 0
        l2 = 0
        while len(fl) > l1 and len(sl) > l2:
            start = max(fl[l1][0], sl[l2][0])
            end = min(fl[l1][1], sl[l2][1])
            if start <= end:
                res.append([start, end])
            if fl[l1][1] == end:
                l1 += 1
            else:
                l2 += 1
        return res