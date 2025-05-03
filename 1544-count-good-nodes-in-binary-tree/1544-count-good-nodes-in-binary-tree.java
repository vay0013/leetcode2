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
    public int goodNodes(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.add(new Pair<>(root, root.val));
        int res = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int value = Math.max(pair.getValue(), node.val);
            if (node.val >= value) {
                res++;
            }
            if (node.left != null) {
                stack.add(new Pair<>(node.left, value));
            }
            if (node.right != null) {
                stack.add(new Pair<>(node.right, value));
            }
        }
        return res;
    }
}