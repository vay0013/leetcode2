class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            while (!stack.isEmpty() && t[stack.peek()] <t[i]) {
                int cur = stack.pop();
                res[cur] = i - cur;
            }
            stack.push(i);
        }
        return res;
    }
}