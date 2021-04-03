package ex0104;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a = x.new TreeNode(3);
		TreeNode b = x.new TreeNode(9);
		TreeNode c = x.new TreeNode(20);
		TreeNode d = x.new TreeNode(15);
		TreeNode e = x.new TreeNode(7);

		a.left = b;
		a.right = c;
		c.left = d;
		c.right = e;

		int max = x.maxDepth(a);

		System.out.println(max);
//		[3,9,20,null,null,15,7]
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int maxLeft = maxDepth(root.left);
		int maxRight = maxDepth(root.right);

		return 1 + Math.max(maxLeft, maxRight);

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