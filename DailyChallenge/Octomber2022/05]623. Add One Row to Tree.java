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
	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if (d == 1) {
			TreeNode newRoot = new TreeNode(v);
			newRoot.left = root;
			return newRoot;
		}

		auxAddOneRow(root, v, d, 1);
		return root;
	}

	public void auxAddOneRow(TreeNode root, int v, int d, int depth) {

		if (root == null || depth >= d)
			return;

		if (depth == d - 1) {
			TreeNode leftNode = new TreeNode(v);
			leftNode.left = root.left;
			root.left = leftNode;
			TreeNode rightNode = new TreeNode(v);
			rightNode.right = root.right;
			root.right = rightNode;
		}

		auxAddOneRow(root.left, v, d, depth + 1);
		auxAddOneRow(root.right, v, d, depth + 1);

	}

}
