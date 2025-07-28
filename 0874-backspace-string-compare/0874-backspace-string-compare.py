class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        def build(st):
            res = ""
            skip = 0
            for i in range(len(st)-1, -1, -1):
                if st[i] == "#":
                    skip += 1
                elif skip > 0:
                    skip -= 1
                else:
                    res += st[i]
            return res
        return build(s) == build(t)