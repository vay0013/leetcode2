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
        for (Map.Entry<Integer, Set<Integer>> v : graph.entrySet()) {
            int node = v.getKey();
            if (!seen.contains(node)) {
                res++;
                seen.add(node);
                for (int nb : v.getValue()) {
                    seen.add(nb);
                }
            }
        }
        return res;
    }
}