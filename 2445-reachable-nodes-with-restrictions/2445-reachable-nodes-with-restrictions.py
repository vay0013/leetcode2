class Solution:
    def reachableNodes(self, n: int, edges: List[List[int]], restricted: List[int]) -> int:
        graph = defaultdict(list)
        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)
        seen = set(restricted)
        seen.add(0)
        q = deque([0])
        res = 0
        while q:
            v = q.popleft()
            res += 1            
            for n in graph[v]:
                if n not in seen:
                    seen.add(n)
                    q.append(n)
        return res
