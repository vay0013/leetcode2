class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> arr = new ArrayList<>();
        arr.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] prev = arr.get(arr.size()-1);
            int[] cur = intervals[i];
            if (cur[0] <= prev[1]) {
                prev[1] = Math.max(cur[1], prev[1]);
            } else {
                arr.add(cur);
            }
        }
        int[][] res = new int[arr.size()][];
        for (int i = 0; i < arr.size(); i++) {
            res[i] = arr.get(i);
        }
        return res;
    }
}