class Solution:
    def shortestAlternatingPaths(self, n: int, redEdges: List[List[int]], blueEdges: List[List[int]]) -> List[int]:
        graph = defaultdict(lambda: defaultdict(list))
        red = 0
        blue = 1
        for a, b in redEdges:
            graph[red][a].append(b)
        for a, b in blueEdges:
            graph[blue][a].append(b)
        
        q = deque([(0, blue, 0), (0, red, 0)])
        seen = {(0, red), (0, blue)}
        res = [-1] * n
        res[0] = 0
        while q:
            v, color, steps = q.popleft()
            res[v] = min(res[v], steps)
            if res[v] == -1:
                res[v] = steps
            for n in graph[color][v]:
                if (n, 1 - color) not in seen:
                    q.append((n, 1 - color, steps + 1))
                    seen.add((n, 1 - color))
        return res