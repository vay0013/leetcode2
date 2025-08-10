class Solution {
    public int trap(int[] h) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < h.length; i++) {
            while (!stack.isEmpty() && h[stack.peek()] < h[i]) {
                int mid = stack.pop();
                if (stack.isEmpty()) {
                    continue;
                }
                int prev = stack.peek();
                res += (i - prev - 1) * (Math.min(h[i], h[prev]) - h[mid]);
            }
            stack.push(i);
        }
        return res;
    }
}