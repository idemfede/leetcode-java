package ex0652;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		TreeNode a = x.new TreeNode(2);
		TreeNode b = x.new TreeNode(1);
		TreeNode c = x.new TreeNode(11);
		TreeNode d = x.new TreeNode(11);
		TreeNode e = x.new TreeNode(1);

		a.left = b;
		a.right = c;
		b.left = d;
		c.left = e;

		List<TreeNode> max = x.findDuplicateSubtrees(a);

		System.out.println(max);
//		[3,9,20,null,null,15,7]	}
	}

	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

		Set<String> acc = new HashSet<String>();

		Map<String, TreeNode> dict = new HashMap<>();

		String x = serialize(root, acc, dict);

		return acc.stream().map(u -> dict.get(u)).collect(Collectors.toList());
	}

	private String serialize(TreeNode tree, Set<String> acc, Map<String, TreeNode> dict) {
		if (tree == null) {
			return "{x}";
		}
		String leftTree = serialize(tree.left, acc, dict);
		String rightTree = serialize(tree.right, acc, dict);

		String x = "{" + tree.val + "}" + leftTree + rightTree;

		if (dict.containsKey(x)) {
			acc.add(x);
		} else {
			dict.put(x, tree);
		}

		return x;
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
