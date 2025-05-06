/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        Stack<Node> stack = new Stack<>();
        stack.push(new Node(root, Long.MIN_VALUE, Long.MAX_VALUE));
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            if (n.node == null) {
                continue;
            }
            if (n.right >= n.node.val || n.left <= n.node.val) {
                return false;
            }
            stack.push(new Node(n.node.left, n.right, (long) n.node.val));
            stack.push(new Node(n.node.right, (long) n.node.val, n.left));
        }
        return true;
    }
}

class Node {
    TreeNode node;
    Long right; 
    Long left;
    Node(TreeNode node, Long right, Long left) {
        this.node = node;
        this.right = right;
        this.left = left;
    }
}