package ex0116;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		Node a = x.new Node(1);
		Node b = x.new Node(2);
		Node c = x.new Node(3);
		Node d = x.new Node(4);
		Node e = x.new Node(5);
		Node f = x.new Node(6);
		Node g = x.new Node(7);

		a.left = b;
		a.right = c;
		b.left = d;
		b.right = e;
		c.left = f;
		c.right = g;

		Node node = x.connect(a);

	}

	public Node connect(Node root) {
		loop(root);
		print(root);
		return root;
	}

	public void loop(Node root) {
		if (root == null) {
			return;
		}

		if (root.left != null) {
			root.left.next = root.right;
		}

		if (root.next != null) {
			if (root.right != null) {
				root.right.next = root.next.left;
			}
		}

		loop(root.left);
		loop(root.right);
	}

	public void print(Node root) {
		if (root == null) {
			return;
		}

		System.out.println(root.val + " -> " + (root.next == null ? "" : root.next.val));
		print(root.left);
		print(root.right);
	}

	class Node {
		public int val;
		public Node left;
		public Node right;
		public Node next;

		public Node() {
		}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, Node _left, Node _right, Node _next) {
			val = _val;
			left = _left;
			right = _right;
			next = _next;
		}
	};

}