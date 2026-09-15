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
    List<List<Integer>> finalList=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()){
        int s=q.size();
        List<Integer> im=new ArrayList<>();
        while(s>0){
         TreeNode node=q.poll();
          im.add(node.val);
          s--;
          if(node.left!=null){
          q.offer(node.left);
          }
          if(node.right!=null){
          q.offer(node.right);
          }
        }
        finalList.add(im);
        }

        return finalList;

    }
}
