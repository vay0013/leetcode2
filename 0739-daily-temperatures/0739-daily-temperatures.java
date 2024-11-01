class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int len = temps.length;
        int[] result = new int[len];
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < len; i++) {
            while(!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                result[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}