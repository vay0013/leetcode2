class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        result = []
        def bt(acc, start):
            if len(acc) == k:
                result.append(acc[:])
                return
            for i in range(start, n+1):
                acc.append(i)
                bt(acc, i+1)
                acc.remove(i)
        bt([], 1)
        return result