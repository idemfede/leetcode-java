package ex0117;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

	public static void main(String[] args) {

		Solution x = new Solution();

		Node a1 = x.new Node(1);
		Node a2 = x.new Node(2);
		Node a3 = x.new Node(3);
		Node a4 = x.new Node(4);
		Node a5 = x.new Node(5);
		Node a6 = x.new Node(6);
		Node a7 = x.new Node(7);
		Node a8 = x.new Node(8);

		a1.left = a2;
		a1.right = a3;

		a2.left = a4;
		a2.right = a5;

		a4.left = a7;
		a3.right = a6;
		a6.right = a8;

		Node node = x.connect(a1);

	}

	public Node connect(Node root) {
		if (root == null) {
			return null;
		}
		loop(root);
		print(root);
		return root;
	}

	public void loop(Node root) {

		Queue<Node> q = new LinkedList<Solution.Node>();

		q.add(root);

		while (!q.isEmpty()) {

			int temp = q.size();
			Node pointer = null;

			while (temp > 0) {

				Node aNode = q.poll();
				if (pointer != null) {
					pointer.next = aNode;
				}
				pointer = aNode;

				if (aNode.left != null) {
					q.add(aNode.left);
				}
				if (aNode.right != null) {
					q.add(aNode.right);
				}

				temp--;
			}
		}

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