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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        dfs(root, 0);
        return result;

    }

    public void dfs(TreeNode root, int degree) {
        if(root == null) return;

        if(result.size() == degree) {
            result.add(new ArrayList<>());
           
        }
        result.get(degree).add(root.val);

        dfs(root.left, degree + 1);
        dfs(root.right, degree + 1);

    }
}
