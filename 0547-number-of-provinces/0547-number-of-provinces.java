class Solution {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = i; j < isConnected[i].length; j++) {
                if (isConnected[i][j] == 1) {
                    graph.computeIfAbsent(i, k -> new HashSet<>()).add(j);
                    graph.computeIfAbsent(j, k -> new HashSet<>()).add(i);
                }
            }
        }
        Set<Integer> seen = new HashSet<>();
        int res = 0;
        for (Map.Entry<Integer, Set<Integer>> con : graph.entrySet()) {
            int v = con.getKey();
            if (!seen.contains(v)) {
                res++;
                Queue<Integer> q = new LinkedList<>();
                seen.add(v);
                q.add(v);
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int nb : graph.get(node)) {
                        if (!seen.contains(nb)) {
                            seen.add(nb);
                            q.add(nb);
                        }
                    }
                }
            }
        }
        return res;
    }
}