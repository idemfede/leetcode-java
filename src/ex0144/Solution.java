package ex0144;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class Solution {

	public static void main(String[] args) {

	}

	public List<Integer> preorderTraversal(TreeNode root) {

		if (root == null) {
			return new ArrayList<>();
		}
		List<Integer> ret = new ArrayList<>();

		ret.add(root.val);
		if (root.left != null) {
			ret.addAll(preorderTraversal(root.left));
		}
		if (root.right != null) {
			ret.addAll(preorderTraversal(root.right));
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