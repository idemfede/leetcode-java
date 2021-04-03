package ex0112;

/**
 * Definition for a binary tree node.
 */
class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a = x.new TreeNode(1);
		TreeNode b = x.new TreeNode(2);
		TreeNode c = x.new TreeNode(20);
		TreeNode d = x.new TreeNode(15);
		TreeNode e = x.new TreeNode(7);

		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;

		boolean sum = x.hasPathSum(a, 3);

		System.out.println(sum);

//		[3,9,20,null,null,15,7]
	}

	public boolean hasPathSum(TreeNode root, int targetSum) {

		if (root == null) {
			return false;
		}

		return loop(root, targetSum);

	}

	public boolean loop(TreeNode root, int targetSum) {

		if (isLeaf(root)) {
			return root.val == targetSum;
		}

		boolean hasPathSumRight = root.right != null && loop(root.right, targetSum - root.val);
		boolean hasPathSumLeft = root.left != null && loop(root.left, targetSum - root.val);

		return hasPathSumLeft || hasPathSumRight;

	}

	public boolean isLeaf(TreeNode node) {
		return node.left == null && node.right == null;
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