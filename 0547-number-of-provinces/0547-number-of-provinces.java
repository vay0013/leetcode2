class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] != 0) {
                    graph.computeIfAbsent(i, k -> new HashSet<>()).add(j);
                    graph.computeIfAbsent(j, k -> new HashSet<>()).add(i);
                }
            }
        }
        Set<Integer> seen = new HashSet<>();
        int res = 0;
        for (Map.Entry<Integer, Set<Integer>> g : graph.entrySet()) {
            int node = g.getKey();
            if (!seen.contains(node)) {
                res++;
                seen.add(node);
                Queue<Integer> q = new LinkedList<>();
                q.add(node);
                while (!q.isEmpty()) {
                    int v = q.poll();
                    for (int nb : graph.get(v)) {
                        if (!seen.contains(nb)) {
                            q.add(nb);
                            seen.add(nb);
                        }
                    }
                }
            }
        }
        return res;
    }
}