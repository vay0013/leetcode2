class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> q = new Stack<>();
        q.add(source);
        seen.add(source);
        while (!q.isEmpty()) {
            int node = q.pop();
            List<Integer> nbs = graph.get(node);
            if (node == destination) {
                return true;
            }
            for (int nb : nbs) {
                if (!seen.contains(nb)) {
                    q.add(nb);
                    seen.add(nb);
                }
            }
        }
        return false;
    }
}