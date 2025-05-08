class StockSpanner {
    int i = 0;
    Stack<int[]> stack = new Stack<>();

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int cur = i;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            cur = Math.min(cur, stack.pop()[1]);
        }
        stack.push(new int[] {price, cur});
        i++;
        return i - cur;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */