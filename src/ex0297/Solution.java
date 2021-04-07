package ex0297;

import java.util.Stack;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a1 = x.new TreeNode(-1);
		TreeNode a2 = x.new TreeNode(-2);
		TreeNode a3 = x.new TreeNode(-3);
		TreeNode a4 = x.new TreeNode(-4);
		TreeNode a5 = x.new TreeNode(-5);
		TreeNode a6 = x.new TreeNode(-6);
		TreeNode a7 = x.new TreeNode(-7);
		TreeNode a8 = x.new TreeNode(-8);

		a1.left = a2;
		a1.right = a3;

		a2.left = a4;
		a2.right = a5;

		a4.left = a7;
		a3.right = a6;
		a6.right = a8;

		String tree = x.serialize(a1);

		TreeNode node = x.deserialize("-1@-2@-4@-7@x@x@x@-5@x@x@-3@x@-6@x@-8@x@x");

		System.out.println(tree);
	}

	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		String nullNode = "x";

		if (root == null) {
			return nullNode;
		}

		String leftString = serialize(root.left);
		String rightString = serialize(root.right);

		return root.val + "@" + leftString + "@" + rightString;

	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		String[] d = data.split("@");

		int[] t = { 0 };

		return loop(d, t);
	}

	public TreeNode loop(String[] arr, int[] t) {
		if (arr[t[0]].equals("x")) {
			return null;
		}

		TreeNode root = new TreeNode(Integer.parseInt(arr[t[0]]));

		t[0]++;
		root.left = loop(arr, t);

		t[0]++;
		root.right = loop(arr, t);

		return root;
	}

	// 1247xxx5xx 3x6x8xx
	public void print(TreeNode root) {
		if (root == null) {
			return;
		}

		print(root.left);
		print(root.right);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

}