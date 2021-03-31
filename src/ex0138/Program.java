package ex0138;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

		Node a1 = aP.new Node(1);
		Node a2 = aP.new Node(2);
		Node a3 = aP.new Node(3);
		Node a4 = aP.new Node(4);
		Node a5 = aP.new Node(5);
		Node a6 = aP.new Node(6);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;

		a2.random = a5;
		a3.random = a3;
		a4.random = a6;
		a6.random = a1;

		Node pointer = aP.copyRandomList(a1);

		a1.print();

	}

	public Node copyRandomList(Node head) {

		if (head == null) {
			return null;
		}

		Map<Node, Node> map = new HashMap<>();

		Node newHead = new Node(head.val);
		map.put(head, newHead);

		Node oldPointer = head;
		Node newPointer = newHead;

		while (oldPointer.next != null) {
			oldPointer = oldPointer.next;
			newPointer.next = new Node(oldPointer.val);
			newPointer = newPointer.next;
			map.put(oldPointer, newPointer);
		}

		oldPointer = head;
		newPointer = newHead;
		while (newPointer != null) {
			if (oldPointer.random != null) {
				newPointer.random = map.get(oldPointer.random);
			}

			oldPointer = oldPointer.next;
			newPointer = newPointer.next;

		}

		return newHead;

	}

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}

		public Node(int val, Node next, Node random) {
			super();
			this.val = val;
			this.next = next;
			this.random = random;
		}

		void print() {
			System.out.print(val);
			System.out.print(" ( ");
			System.out.print(random != null ? random.val : " ");
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
