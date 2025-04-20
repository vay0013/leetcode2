class Solution:
    def partitionLabels(self, s: str) -> List[int]:
        arr = {}
        for i in range(len(s)):
            arr[s[i]] = i
        res = []
        farthest = 0
        start = 0
        for i in range(len(s)):
            farthest = max(farthest, arr[s[i]])
            if i == farthest:
                res.append(i - start+1)
                start = i+1
        return res