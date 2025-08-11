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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, List<TreeNode>> map = new HashMap<>();
        traverse(root, map);
        List<TreeNode> res = new ArrayList<>();
        for (Map.Entry<String, List<TreeNode>> entry : map.entrySet()) {
            List<TreeNode> nodes = entry.getValue();
            if (nodes.size() > 1) {
                res.add(nodes.get(0));
            }
        }
        return res;
    }

    private String traverse(TreeNode node, Map<String, List<TreeNode>> map) {
        if (node == null) {
            return "#";
        }
        String left = traverse(node.left, map);
        String right = traverse(node.right, map);
        String serialized = node.val + "," + left + "," + right;
        List<TreeNode> nodes = map.getOrDefault(serialized, new ArrayList<>());
        nodes.add(node);
        map.put(serialized, nodes);
        return serialized;
    }
}