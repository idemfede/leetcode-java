package ex0236;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a1 = x.new TreeNode(1);
		TreeNode a2 = x.new TreeNode(2);
		TreeNode a3 = x.new TreeNode(3);
		TreeNode a4 = x.new TreeNode(4);
		TreeNode a5 = x.new TreeNode(5);
		TreeNode a6 = x.new TreeNode(6);
		TreeNode a7 = x.new TreeNode(7);
		TreeNode a8 = x.new TreeNode(8);

		a1.left = a2;
		a1.right = a3;

		a2.left = a4;
		a2.right = a5;

		a4.left = a7;
		a3.right = a6;
		a6.right = a8;

		TreeNode node = x.lowestCommonAncestor(a1, null, null);

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}

		if (root == p || root == q) {
			return root;
		}

		TreeNode leftAncestor = lowestCommonAncestor(root.left, p, q);
		TreeNode rightAncestor = lowestCommonAncestor(root.right, p, q);

		if (leftAncestor != null && rightAncestor != null) {
			return root;
		} else if (leftAncestor == null) {
			return rightAncestor;
		} else {
			return leftAncestor;
		}

	}

	public boolean contains(TreeNode node, int val) {
		if (node == null) {
			return false;
		}

		boolean left = contains(node.left, val);
		boolean right = contains(node.left, val);

		return left || right;
	}

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