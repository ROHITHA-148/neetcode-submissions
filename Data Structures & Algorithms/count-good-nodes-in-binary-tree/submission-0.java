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
    int count=1;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int limit=root.val;
        helper(root.left, limit);
        helper(root.right, limit);
        
       return count;
     
    }
    public int helper(TreeNode node, int limit){
        if(node==null){
            return 0;
        }
     if(node.val>=limit){
        count++;
        limit=node.val;
     }
     helper(node.left,limit);
     helper(node.right,limit);
     return 0;
    }
}
