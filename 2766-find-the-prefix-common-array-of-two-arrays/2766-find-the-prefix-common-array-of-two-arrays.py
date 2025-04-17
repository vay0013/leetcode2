class Solution:
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        n = len(A)
        result = [0] * n
        freq = [0] * (n+1)
        count = 0
        for i in range(n):
            freq[A[i]] += 1
            if freq[A[i]] == 2:
                count+=1
            freq[B[i]] += 1
            if freq[B[i]] == 2:
                count+=1
            result[i] = count   
        return result     