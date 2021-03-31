package ex0430;

import java.util.Stack;

import ex0430.Program.Node;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

//		[1,2,3,4,5,6,null,null,null,7,8,null,null,11,12]

		Node a1 = aP.new Node(1);
		Node a2 = aP.new Node(2);
		Node a3 = aP.new Node(3);
		Node a4 = aP.new Node(4);
		Node a5 = aP.new Node(5);
		Node a6 = aP.new Node(6);

		Node b1 = aP.new Node(7);
		Node b2 = aP.new Node(8);

		Node c1 = aP.new Node(11);
		Node c2 = aP.new Node(12);

//		a1.child = a2;
//		a2.child = a3;

		a1.next = a2;
		a2.prev = a1;
		a2.next = a3;
		a3.prev = a2;
		a3.next = a4;
		a4.prev = a3;
		a4.next = a5;
		a5.prev = a4;
		a5.next = a6;
		a6.prev = a5;

		b1.next = b2;
		b2.prev = b1;

		c1.next = c2;
		c2.prev = c1;

		a3.child = b1;
		b2.child = c1;

		Node pointer = aP.flatten(a1);

		a1.print();
	}

	public Node flatten(Node head) {

		if (head == null) {
			return null;
		}

		Stack<Node> stack = new Stack<Node>();
		Node pointer = head;

		while (true) {

			if (pointer.child != null) {
				if (pointer.next != null) {
					stack.add(pointer.next);
				}
				pointer.child.prev = pointer;
				pointer.next = pointer.child;
				pointer.child = null;
			} else {
				if (pointer.next == null) {
					if (stack.isEmpty()) {
						break;
					} else {
						pointer.next = stack.pop();
						pointer.next.prev = pointer;
					}
				}
			}
			pointer = pointer.next;

		}

		return head;
	}

	class Node {
		public int val;
		public Node prev;
		public Node next;
		public Node child;

		public Node(int val) {
			super();
			this.val = val;
		}

		public Node(int val, Node prev, Node next, Node child) {
			super();
			this.val = val;
			this.prev = prev;
			this.next = next;
			this.child = child;
		}

		void print() {
			System.out.print(val);
			System.out.print(" ( ");
			System.out.print(prev);
			System.out.print(" , ");
			System.out.print(next);
			System.out.print(" ) ");
			System.out.print(" ->> ");
			if (next == null) {
			} else {
				next.print();
			}
		}

		void printSimple() {
			System.out.println(val);
		}

		@Override
		public String toString() {
			return String.valueOf(val);
		}

	};

}
