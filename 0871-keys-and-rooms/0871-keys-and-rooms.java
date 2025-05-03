class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> seen = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        seen.add(0);
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int nb : rooms.get(node)) {
                if (!seen.contains(nb)) {
                    seen.add(nb);
                    stack.add(nb);
                }
            }
        }
        return rooms.size() == seen.size();
    }
}