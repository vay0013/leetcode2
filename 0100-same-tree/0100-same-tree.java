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
    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(t1);
        q.add(t2);
        while (!q.isEmpty()) {
            TreeNode node1 = q.poll();
            TreeNode node2 = q.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null) {
                return false; 
            }
            if (node1.val != node2.val) {
                return false;
            }
            q.add(node1.left);
            q.add(node2.left);
            q.add(node1.right);
            q.add(node2.right);
        }
        return true;
    }
}