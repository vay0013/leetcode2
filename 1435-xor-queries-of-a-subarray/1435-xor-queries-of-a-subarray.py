class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        res = []
        for i in range(1, len(arr)):
            arr[i] ^= arr[i - 1]

        for a, b in queries:
            if a > 0:
                res.append(arr[b] ^ arr[a-1])
            else:
                res.append(arr[b])
        return res