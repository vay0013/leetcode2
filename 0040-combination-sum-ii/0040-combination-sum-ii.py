class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        result = []
        def bt(acc, path, start):
            if path > target:
                return
            if path == target:
                result.append(acc[:])
                return
            for i in range(start, len(candidates)):
                if i > start and candidates[i] == candidates[i-1]:
                    continue
                acc.append(candidates[i])
                bt(acc, path+candidates[i], i+1)
                acc.remove(candidates[i])
        bt([], 0, 0)
        return result 