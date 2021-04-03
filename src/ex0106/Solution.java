package ex0106;

import java.util.Arrays;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		int[] inorder = { 2, 1 };
		int[] postorder = { 2, 1 };

		TreeNode res = x.buildTree(inorder, postorder);

		System.out.println(res);
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder == null || postorder == null || postorder.length == 0) {
			return null;
		}

		if (postorder.length == 1) {
			return new TreeNode(postorder[0]);
		}
		int rootPos = postorder.length - 1;
		int root = postorder[rootPos];
		int k = searchIndex(inorder, root);

//		from − This is the initial index of the range to be copied, inclusive.
//		to − This is the final index of the range to be copied, exclusive.
		TreeNode node = new TreeNode(root);
		node.left = buildTree(Arrays.copyOfRange(inorder, 0, k), Arrays.copyOfRange(postorder, 0, k));
		node.right = buildTree(Arrays.copyOfRange(inorder, k + 1, rootPos + 1),
				Arrays.copyOfRange(postorder, k, rootPos));

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