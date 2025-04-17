class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        result = [0] * n
        for cur in range(n):
            count = 0
            for i in range(cur + 1):
                for j in range(cur + 1):
                    if A[i] == B[j]:
                        count+=1
                        break
            result[cur] = count
        return result