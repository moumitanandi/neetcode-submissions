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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> (b-a));
        dfs(root, k, q);
        return q.poll();
    }

    public void dfs(TreeNode root, int k, PriorityQueue<Integer> q) {
        if(root != null) {
            q.offer(root.val);
            if(q.size() > k) {
                q.poll();
            }
            dfs(root.left, k, q);
            dfs(root.right, k, q);
        }

    }
}
