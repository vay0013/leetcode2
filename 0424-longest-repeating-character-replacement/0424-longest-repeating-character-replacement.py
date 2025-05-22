class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        freq = defaultdict(int)
        start = 0
        res = 0
        for end in range(len(s)):
            c = s[end]
            freq[c]+=1
            max_freq = max(freq.values())
            if end - start + 1 - max_freq > k:
                freq[s[start]]-=1
                start+=1
            res = max(res, end - start + 1)
        return res