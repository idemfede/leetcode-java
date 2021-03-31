package ex0234;

import java.util.List;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(2);
		ListNode a3 = aP.new ListNode(1);
		ListNode a4 = aP.new ListNode(4);
		ListNode a5 = aP.new ListNode(5);
		ListNode a6 = aP.new ListNode(77);
		ListNode a7 = aP.new ListNode(4);
		ListNode a8 = aP.new ListNode(4);
		ListNode a9 = aP.new ListNode(3);
		ListNode a10 = aP.new ListNode(2);
		ListNode a11 = aP.new ListNode(1);
//		ListNode a12 = aP.new ListNode(1);

		a1.next = a2;
		a2.next = a3;
//		a3.next = a4;
//		a4.next = a5;
//		a5.next = a6;
//		a6.next = a7;
//		a7.next = a8;
//		a8.next = a9;
//		a9.next = a10;
//		a10.next = a11;
//		a11.next = a12;

//		ListNode test = aP.reverseFrom(a11);

//		test.print();

		System.out.println(aP.isPalindrome(a1));

	}

	public boolean isPalindrome(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;

		while (fast.next != null && fast.next.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}

		ListNode reverseFrom = slow.next;
		if (fast.next == null) {
			reverseFrom = slow;
		}

		ListNode secondHalf = reverseFrom(reverseFrom);

		return compare(head, secondHalf);

	}

	private boolean compare(ListNode head, ListNode secondHalf) {

		ListNode pointerA = head;
		ListNode pointerB = secondHalf;

		while (pointerA != null && pointerB != null) {
			if (pointerA.val != pointerB.val) {
				return false;
			}
			pointerA = pointerA.next;
			pointerB = pointerB.next;
		}

		return true;
	}

	public ListNode reverseFrom(ListNode node) {
		ListNode pointer = node;
		ListNode head = node.next;
		ListNode temp;

		while (head != null) {

			temp = head.next;
			head.next = pointer;

			pointer = head;
			head = temp;

		}

		node.next = null;
		return pointer;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}

		void print() {
			System.out.print(val);
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
	}
}
