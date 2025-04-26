class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> inDegree = new HashMap<>();
        for (int[] edge : edges) {
            inDegree.put(edge[0], inDegree.getOrDefault(edge[0], 0) + 1);
            inDegree.put(edge[1], inDegree.getOrDefault(edge[1], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> graph : inDegree.entrySet()) {
            if (graph.getValue() == edges.length) {
                return graph.getKey();
            }
        }
        return -1;
    }
}