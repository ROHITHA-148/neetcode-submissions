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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        String s=new String();
        if(root==null){
            s=s+'#';
            s=s+',';
            return s;
        }
        s=s+root.val+',';
        s=s+serialize(root.left);
        s=s+serialize(root.right);
        return s;

    }

   int i;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        i=0;
         String[] values=data.split(",");
        TreeNode root=helper(values);
        return root;

    }

        public TreeNode helper(String[] values){
       

        if(values[i].equals("#")){
            i++;
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(values[i]));
        i++;
        root.left=helper(values);
        root.right=helper(values);
        return root;
    }
}
