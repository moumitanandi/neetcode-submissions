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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(p);
        q2.add(q);

        while(!q1.isEmpty() && !q2.isEmpty()) {
            TreeNode tmp1 = q1.poll();
            TreeNode tmp2 = q2.poll();
            if(tmp1 == null && tmp2 == null) continue;
            if(tmp1 == null || tmp2 == null) return false;
            if(tmp1.val != tmp2.val) return false;
           
            q1.offer(tmp1.left);
            q2.offer(tmp2.left);
            
            q1.offer(tmp1.right);
            q2.offer(tmp2.right);
            
        }

        return q1.isEmpty() && q2.isEmpty() ;
        
    }
}
