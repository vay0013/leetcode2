class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> sup = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        while (!q.isEmpty()) {
            sup.add(q.poll());
        }
        q.add(x);
        while (!sup.isEmpty()) {
            q.add(sup.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */