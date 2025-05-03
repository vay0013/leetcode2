class SmallestInfiniteSet {
    private Set<Integer> seen = new HashSet<>();
    private Queue<Integer> q = new PriorityQueue<>();
    public SmallestInfiniteSet() {
        for (int i = 1; i < 1001; i++) {
            q.add(i);
            seen.add(i);
        }
    }
    
    public int popSmallest() {
        int smallest = q.poll();
        seen.remove(smallest);
        return smallest;
    }
    
    public void addBack(int num) {
        if (!seen.contains(num)) {
            q.add(num);
            seen.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */