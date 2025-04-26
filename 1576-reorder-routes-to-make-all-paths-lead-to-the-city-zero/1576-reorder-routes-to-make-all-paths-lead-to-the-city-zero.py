class Solution:
    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        og = set()
        graph = defaultdict(list)
        for a, b in connections:
            og.add((a, b))
            graph[a].append(b)
            graph[b].append(a)
        seen = {0}
        q = deque([0])
        res = 0
        while q:
            v = q.popleft()
            for n in graph[v]:
                if n not in seen:
                    if (v, n) in og:
                        res += 1
                    seen.add(n)
                    q.append(n)
        return res
