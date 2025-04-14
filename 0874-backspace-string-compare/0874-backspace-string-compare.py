class Solution:
    def backspaceCompare(self, a: str, t: str) -> bool:
        def build(s):
            result = ""
            skip = 0
            for c in range(len(s)-1, -1, -1):
                if s[c] == '#':
                    skip+=1
                elif skip > 0:
                    skip-=1
                else:
                    result+=s[c]
            return result
        return build(a) == build(t)
        