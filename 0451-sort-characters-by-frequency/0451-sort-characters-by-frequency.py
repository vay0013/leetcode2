class Solution:
    def frequencySort(self, s: str) -> str:
        count = {}
        for i in range(len(s)):
            count[s[i]] = 1 + count.get(s[i], 0)
        min_heap = []
        for k, v in count.items():
            heappush(min_heap, (-v, k))
        result = ""
        while min_heap:
            v, k = heappop(min_heap)
            for i in range(-v):
                result += k
        return result