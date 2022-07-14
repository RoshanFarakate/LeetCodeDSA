class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return bTHelper(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
    }
    
    public TreeNode bTHelper(int[] preorder, int[] inorder, int siPre, int eiPre, int siIn, int eiIn) {
        
        // Base case :- if number of elements in preorder is 0
        if(siPre>eiPre) return null;
        
        //Defining the root node for current recursion
        // first element preorder will be root of the tree
        int rootData = preorder[siPre];
        TreeNode root = new TreeNode(rootData);
        
        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndexInorder = -1;
        for(int i=siIn; i<=eiIn; i++){
            if(inorder[i] == rootData){
                rootIndexInorder = i;
                break;
            }
        }
        
        //Defining index limits for Left Subtree Inorder
        int siInLeft = siIn;
        int eiInLeft = rootIndexInorder-1;
        
        //Defining index limits for Right Subtree Inorder
        int siInRight = rootIndexInorder+1;
        int eiInRight = eiIn;
        
        //Defining index limits for Left Subtree Preorder
        int siPreLeft = siPre+1;
        int leftSubtreeLength = eiInLeft-siInLeft+1;
        int eiPreLeft = siPreLeft + (leftSubtreeLength-1);
        
        //Defining index limits for Right Subtree Preorder
        int siPreRight = eiPreLeft+1;
        int eiPreRight = eiPre;
        
        root.left = bTHelper(preorder, inorder, siPreLeft, eiPreLeft, siInLeft, eiInLeft);
        root.right = bTHelper(preorder, inorder, siPreRight, eiPreRight, siInRight, eiInRight);
        
        return root;
    }
}
