/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }
        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> seen = new HashMap<>();
        seen.put(node, new Node(node.val));
        q.offer(node);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (Node nb : cur.neighbors) {
                if (!seen.containsKey(nb)) {
                    seen.put(nb, new Node(nb.val));
                    q.offer(nb);
                }
                seen.get(cur).neighbors.add(seen.get(nb));
            }
        }
        return seen.get(node);
    }
}