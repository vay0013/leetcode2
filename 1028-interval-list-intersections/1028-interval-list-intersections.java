class Solution {
    public int[][] intervalIntersection(int[][] f, int[][] s) {
        List<int[]> arr = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < f.length && p2 < s.length) {
            int start = Math.max(f[p1][0], s[p2][0]);
            int end = Math.min(f[p1][1], s[p2][1]);
            if (start <= end) {
                arr.add(new int[] {start, end});
            }
            if (f[p1][1] < s[p2][1]) {
                p1++;
            } else {
                p2++;
            }
        }
        int[][] res = new int[arr.size()][2];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}