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
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return res;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> currentlist=new ArrayList<>();
            int s= queue.size();
            while(s>0){
            TreeNode node=queue.poll();
            currentlist.add(node.val);
            s--;
            if(node.left!=null){
            queue.offer(node.left);
            }
            if(node.right!=null){
            queue.offer(node.right);
            }
        }
        res.add(currentlist);
        }
      return res;
    }
}
