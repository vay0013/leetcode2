class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        result = []
        def bt(acc, start):
            if start == len(s):
                result.append(acc)
            else:
                if s[start].isalpha():
                    bt(acc + s[start].swapcase(), start+1)
                bt(acc + s[start], start+1)
        bt("", 0)
        return result
