class Solution:
    def minReorder(self, n: int, connections: List[List[int]]) -> int:
        og = set()
        graph = defaultdict(list)
        for a, b in connections:
            og.add((a, b))

            graph[a].append(b)
            graph[b].append(a)
        seen = set()
        seen.add(0)
        q = deque([0])
        res = 0
        while q:
            v = q.popleft()
            for nb in graph[v]:
                if nb not in seen:
                    if (v, nb) in og:
                        res += 1
                    q.append(nb)
                    seen.add(nb)
        return res