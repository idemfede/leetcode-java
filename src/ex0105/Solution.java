package ex0105;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] preorder = { 3, 9, 20, 15, 7 };

		TreeNode res = x.buildTree(preorder, inorder);

		System.out.println(res);
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		if (inorder == null || preorder == null || preorder.length == 0) {
			return null;
		}

		if (preorder.length == 1) {
			return new TreeNode(preorder[0]);
		}
		int rootPos = 0;
		int root = preorder[rootPos];
		int k = searchIndex(inorder, root);

//		from   This is the initial index of the range to be copied, inclusive.
//		to   This is the final index of the range to be copied, exclusive.
		TreeNode node = new TreeNode(root);
		node.left = buildTree(Arrays.copyOfRange(preorder, 1, k + 1), Arrays.copyOfRange(inorder, 0, k));
		node.right = buildTree(Arrays.copyOfRange(preorder, k + 1, preorder.length),
				Arrays.copyOfRange(inorder, k + 1, preorder.length));

		return node;
	}

	public int searchIndex(int[] inorder, int q) {
		int ret = 0;

		while (inorder[ret] != q) {
			ret++;
		}

		return ret;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}