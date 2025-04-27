class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
        Set<Integer> seen = new HashSet<>();
        seen.add(0);
        for (int i : restricted) {
            seen.add(i);
        }
        int res = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int v = q.poll();
            res++;
            for (int nb : graph.get(v)) {
                if (!seen.contains(nb)) {
                    seen.add(nb);
                    q.add(nb);
                }
            }
        }
        return res;
    }
}