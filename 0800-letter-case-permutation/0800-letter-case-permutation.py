class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        result = []
        def bt(acc, start):
            if len(acc) == len(s):
                result.append(acc)
            for i in range(start, len(s)):
                if s[i].isalpha():
                    bt(acc + s[i].swapcase(), i+1)
                bt(acc + s[i], i+1)
        bt("", 0)
        return result
