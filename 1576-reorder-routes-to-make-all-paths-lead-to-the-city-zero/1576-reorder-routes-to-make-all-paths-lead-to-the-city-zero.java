class Solution {
    public int minReorder(int p, int[][] connections) {
        Set<String> og = new HashSet<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] connect : connections) {
            og.add(connect[0] + "," + connect[1]);

            graph.computeIfAbsent(connect[1], k -> new ArrayList<>()).add(connect[0]);
            graph.computeIfAbsent(connect[0], k -> new ArrayList<>()).add(connect[1]);
        }
        Set<Integer> seen = new HashSet<>();
        int res = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        seen.add(0);
        while (!q.isEmpty()) {
            int v = q.poll();
            for (int n : graph.get(v)) {
                if (!seen.contains(n)) {
                    if (og.contains(v+","+n)) {
                        res++;
                    }
                    q.add(n);
                    seen.add(n);
                }
            }
        }   
        return res;
    }
}