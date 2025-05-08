class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int wall = h[i];
            while (!stack.isEmpty() && h[stack.peek()] < h[i]) {
                int cur = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                res += (Math.min(h[left], h[i]) - h[cur]) * (i - 1 - left);
            }
            stack.push(i);
        }
        return res;
    }
}