class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        result = [0] * n
        seen = set()
        for cur in range(n):
            seen.add(A[cur])
            count = 0
            for i in range(cur+1):
                if B[i] in seen:
                    count+=1
            result[i] = count
        return result