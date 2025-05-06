class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        res = []
        def bfs(acc, v):
            if v == len(graph) - 1:
                res.append(acc[:])
                return 
            for nb in graph[v]:
                acc.append(nb)
                bfs(acc, nb)
                acc.remove(nb)
        bfs([0], 0)
        return res
