class Solution:
    def hIndex(self, citations: List[int]) -> int:
        n = len(citations)
        bucket = [0] * (n+1)
        for citation in citations:
            if citation >= n:
                bucket[n] += 1
            else:
                bucket[citation] += 1
        count = 0
        for i in range(n, -1, -1):
            count += bucket[i]
            if count >= i:
                return i
        return 0
