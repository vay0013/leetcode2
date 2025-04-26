class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    graph.computeIfAbsent(i, k -> new ArrayList<>()).add(j);
                    graph.computeIfAbsent(j, k -> new ArrayList<>()).add(i);
                }
            }
        }
        int res = 0;
        Set<Integer> seen = new HashSet<>();
        for(Map.Entry<Integer, List<Integer>> g : graph.entrySet()) {
            int node = g.getKey();
            if (!seen.contains(node)) {
                res++;
                Queue<Integer> q = new LinkedList<>();
                q.add(node);
                seen.add(node);
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