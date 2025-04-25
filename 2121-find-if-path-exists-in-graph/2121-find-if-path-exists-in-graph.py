class Solution:
    def validPath(self, n: int, edges: List[List[int]], source: int, destination: int) -> bool:
        graph = defaultdict(list)
        for a, b in edges:
            graph[a].append(b)
            graph[b].append(a)
        q = deque([source])
        seen = {source}
        while q:
            node = q.popleft()
            if node == destination:
                return True
            for nb in graph[node]:
                if nb not in seen:
                    q.append(nb)
                    seen.add(nb)
        return False