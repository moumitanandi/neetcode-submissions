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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            TreeNode newNode = queue.poll();
            TreeNode temp = newNode.left;
            newNode.left = newNode.right;
            newNode.right = temp;

            if(newNode.left != null) {
                queue.offer(newNode.left);
            }
            if(newNode.right != null) {
                queue.offer(newNode.right);
            }
         
        }
        return root;
        
    }

}
