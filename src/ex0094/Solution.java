package ex0094;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class Solution {

	public static void main(String[] args) {

	}

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<Integer> ret = new ArrayList<>();

		if (root.left != null) {
			ret.addAll(inorderTraversal(root.left));
		}
		ret.add(root.val);
		if (root.right != null) {
			ret.addAll(inorderTraversal(root.right));
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