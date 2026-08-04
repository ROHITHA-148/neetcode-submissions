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
    boolean result=true;
    public boolean isBalanced(TreeNode root) {
        depth(root);
        return result;

    }
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=depth(root.left);
        int right=depth(root.right);
        if(Math.abs(right-left)>1){
             result=false;
             return 0;
        }
        return Math.max(left,right)+1;
    }
}
