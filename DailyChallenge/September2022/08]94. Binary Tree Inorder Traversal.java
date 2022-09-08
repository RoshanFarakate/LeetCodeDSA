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
    public void inorder(ArrayList<Integer> al,TreeNode root){
        if(root!=null){
            inorder(al,root.left);
            al.add(root.val);
            inorder(al,root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        inorder(al,root);     
        return al;
    }
}
