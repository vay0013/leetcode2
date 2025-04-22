class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        res = 0
        h = 0
        for i in range(len(gain)):
            h += gain[i]
            res = max(res, h)
        return res