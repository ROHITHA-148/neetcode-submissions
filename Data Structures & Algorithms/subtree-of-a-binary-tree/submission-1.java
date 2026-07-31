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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       boolean res=false;
       if(subRoot==null){
        return true;
       }
       if(root==null){
        return false;
       }
       if(isSameTree(root,subRoot)){
            return true;
         }
       
        boolean valid1=isSubtree(root.left,subRoot);
        boolean valid2=isSubtree(root.right,subRoot);
        return valid1 || valid2;
    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null){
        return true;
       }
       else if(root==null || subRoot==null){
        return false;
       }
       if(root.val==subRoot.val){
        boolean valid1=isSameTree(root.left,subRoot.left); 
        boolean valid2=isSameTree(root.right,subRoot.right);
        return valid1 && valid2;
       }
        return false;
    }
}
