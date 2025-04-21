class Solution:
    def compress(self, chars: List[str]) -> int:
        i = 0
        res = 0
        while i < len(chars):
            count = 1
            while i+count < len(chars) and chars[i+count] == chars[i]:
                count += 1
            chars[res] = chars[i]
            res += 1
            if count > 1:
                l = str(count)
                chars[res:res + len(l)] = list(l)
                res += len(l)
            i += count
        return res