class Solution {
    public TreeNode pruneTree(TreeNode root) {
        return req(root)?root:null;
    }
    public boolean req(TreeNode root){
        if(root==null){ return false; }
        boolean bool=root.val==1;
        boolean bool1=req(root.left);
        boolean bool2=req(root.right);
        if(!bool1){ root.left=null; }
        if(!bool2){ root.right=null; }
        return bool || bool1 || bool2;
    }
}
