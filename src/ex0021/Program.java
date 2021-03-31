package ex0021;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

		ListNode a1 = aP.new ListNode(2);
		ListNode a2 = aP.new ListNode(4);
		ListNode a3 = aP.new ListNode(6);
		ListNode a4 = aP.new ListNode(8);

		ListNode b1 = aP.new ListNode(3);
		ListNode b2 = aP.new ListNode(5);
		ListNode b3 = aP.new ListNode(7);
		ListNode b4 = aP.new ListNode(9);

//		a1.next = a2;
//		a2.next = a3;
//		a3.next = a4;

//		b1.next = b2;
//		b2.next = b3;
//		b3.next = b4;

		ListNode test = aP.mergeTwoLists(a1, b1);

		test.print();

	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode head;
		ListNode current;
		ListNode other;

		if (l1.val < l2.val) {
			head = l1;
			other = l2;
		} else {
			head = l2;
			other = l1;
		}

		current = head;

		while (current.next != null) {
			if (current.next.val < other.val) {
				current = current.next;
			} else {
				ListNode temp = current.next;
				current.next = other;
				current = current.next;
				other = temp;
			}
		}

		if (other != null) {
			current.next = other;
		}

		return head;

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
