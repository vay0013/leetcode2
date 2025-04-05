class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        min_heap = []
        count = {}
        for n in nums:
            count[n] = 1 + count.get(n, 0)
        for key, val in count.items():
            heappush(min_heap, (-val, key))
        result = []
        while len(result) < k:
            result.append(heappop(min_heap)[1])
        return result