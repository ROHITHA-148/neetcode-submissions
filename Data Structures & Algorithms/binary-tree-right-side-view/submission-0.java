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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            while(s>0){
                TreeNode node=queue.poll();
                if(s==1){
                  result.add(node.val);
                }
                s--;
                if(node.left!=null){
                queue.offer(node.left);
                }
                if(node.right!=null){
                queue.offer(node.right);
                }

            }
        }

        return result;
        
    }
}
