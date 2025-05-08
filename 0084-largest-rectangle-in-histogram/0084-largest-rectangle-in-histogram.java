class Solution {
    public int largestRectangleArea(int[] h) {
        Stack<int[]> stack = new Stack<>(); // pair index, height
        int res = 0;
        for (int i = 0; i < h.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1]>h[i]) {
                int[] cur = stack.pop();
                res = Math.max(res, (i - cur[0]) * cur[1]);
                start = cur[0];
            }
            stack.push(new int[]{start, h[i]});
        }
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            res = Math.max(res, (h.length - cur[0]) * cur[1]);
        }
        return res;
    }
}