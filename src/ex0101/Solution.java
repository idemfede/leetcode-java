package ex0101;

/**
 * Definition for a binary tree node.
 */
class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a = x.new TreeNode(1);
		TreeNode b = x.new TreeNode(2);
		TreeNode c = x.new TreeNode(2);
		TreeNode d = x.new TreeNode(15);
		TreeNode e = x.new TreeNode(7);

		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;

		boolean sym = x.loop(a.left, a.right);

		System.out.println(sym);

//		[3,9,20,null,null,15,7]
	}

	public boolean isSymmetric(TreeNode root) {
		return loop(root.left, root.right);
	}

	public boolean loop(TreeNode node1, TreeNode node2) {

		if (node1 == null)
			return node2 == null;
		if (node2 == null)
			return false;
		if (node1.val != node2.val)
			return false;
		return loop(node1.left, node2.right) && loop(node1.right, node2.left);
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