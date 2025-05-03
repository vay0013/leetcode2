class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        graph = defaultdict(list)
        for i in range(n):
            for j in range(i+1, n):
                if isConnected[i][j]:
                    graph[i].append(j)
                    graph[j].append(i)
        seen = set()
        res = 0
        for i in range(n):
            if i not in seen:
                res += 1
                q = deque([i])
                seen.add(i)
                while q:
                    v = q.popleft()
                    for nb in graph[v]:
                        if nb not in seen:
                            seen.add(nb)
                            q.append(nb)
        return res