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
    int pIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {  
      
    TreeNode root=helper(preorder,inorder,0,inorder.length-1);     
    return root;
    }
    public TreeNode helper(int[] preorder, int[] inorder,int left,int right){
        if(left>right){
            return null;
        }
       TreeNode root=new TreeNode(preorder[pIndex]);
        pIndex++;
       for(int i=0;i<inorder.length;i++){
        if(root.val==inorder[i]){
            int pivot=i;
             root.left=helper(preorder,inorder,left,pivot-1);
             root.right=helper(preorder,inorder,pivot+1,right);
        }
       }
      return root;
    }
}
