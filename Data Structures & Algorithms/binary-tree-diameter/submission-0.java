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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] edges = new int[1];
        dfs(root, edges);
        return edges[0];
    }

    public int dfs(TreeNode root, int[] edges) {
        if(root == null) return 0;

        int left = dfs(root.left, edges);
        int right = dfs(root.right, edges);

        edges[0] = Math.max(edges[0], left + right);

        return 1 + Math.max(left, right);
    }
}
