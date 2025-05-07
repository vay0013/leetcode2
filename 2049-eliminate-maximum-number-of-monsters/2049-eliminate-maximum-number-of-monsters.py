class Solution:
    def eliminateMaximum(self, dist: List[int], speed: List[int]) -> int:
        heap = []
        for i in range(len(dist)):
            heappush(heap, dist[i] / speed[i])
        res = 0
        for time in range(len(dist)):
            path = heappop(heap)
            if path <= time:
                break
            res += 1
        return res