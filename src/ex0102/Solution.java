package ex0102;

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

		List<List<Integer>> ret = x.levelOrder(a);

//		[3,9,20,null,null,15,7]
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}

		List<List<Integer>> ret = new ArrayList<>();

		List<TreeNode> kids = new ArrayList<TreeNode>();
		kids.add(root);

		while (!kids.isEmpty()) {
			List<Integer> aux = new ArrayList<Integer>();
			for (TreeNode node : kids) {
				aux.add(node.val);
			}
			ret.add(aux);

			kids = kidsOf(kids);
		}

		return ret;

	}

	private List<TreeNode> kidsOf(List<TreeNode> list) {
		List<TreeNode> ret = new ArrayList<TreeNode>();

		for (TreeNode treeNode : list) {
			if (treeNode.left != null) {
				ret.add(treeNode.left);
			}
			if (treeNode.right != null) {
				ret.add(treeNode.right);
			}
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