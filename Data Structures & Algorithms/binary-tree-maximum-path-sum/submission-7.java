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
    int maxpath=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
       helper(root);
       return maxpath;
    }
    public int helper(TreeNode root){
         if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        left=Math.max(left,0);
        right=Math.max(right,0);
        maxpath=Math.max(maxpath,left+root.val+right); 
        return Math.max(left,right)+root.val;
    }
}
