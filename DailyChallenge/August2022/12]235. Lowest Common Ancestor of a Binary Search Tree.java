class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         int min= (p.val<=q.val)?p.val:q.val;
    int max= (p.val>=q.val)?p.val:q.val;
    
    if(root.val>=min && root.val<=max) return root;
    if(root.val<min && root.val<max) return lowestCommonAncestor(root.right, p, q);
    if(root.val>min && root.val>max) return lowestCommonAncestor(root.left, p, q);
    
    return root;
    }
}
