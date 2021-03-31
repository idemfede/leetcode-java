package ex0002;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(1);
		ListNode a3 = aP.new ListNode(1);
		ListNode a4 = aP.new ListNode(1);

		ListNode b1 = aP.new ListNode(1);
		ListNode b2 = aP.new ListNode(2);
		ListNode b3 = aP.new ListNode(3);
		ListNode b4 = aP.new ListNode(4);

		b1.next = b2;
		b2.next = b3;
		b3.next = b4;

		ListNode test = aP.addTwoNumbers(a1, b1);

		test.print();

	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		boolean rest = false;

		if (l1 == null || l2 == null) {
			return null;
		}

		int sum = l1.val + l2.val + (rest ? 1 : 0);
		rest = sum > 9;

		ListNode newHead = new ListNode(sum % 10);
		ListNode sumPointer = newHead;

		ListNode p1 = l1.next;
		ListNode p2 = l2.next;

		while (p1 != null && p2 != null) {
			sum = p1.val + p2.val + (rest ? 1 : 0);
			rest = sum > 9;

			sumPointer.next = new ListNode(sum % 10);
			sumPointer = sumPointer.next;
			p1 = p1.next;
			p2 = p2.next;

		}

		while (p1 != null) {
			sum = p1.val + (rest ? 1 : 0);
			rest = sum > 9;
			sumPointer.next = new ListNode(sum % 10);
			sumPointer = sumPointer.next;
			p1 = p1.next;

		}

		while (p2 != null) {
			sum = p2.val + (rest ? 1 : 0);
			rest = sum > 9;
			sumPointer.next = new ListNode(sum % 10);
			sumPointer = sumPointer.next;
			p2 = p2.next;

		}
		if (rest) {
			sumPointer.next = new ListNode(1);
		}
		return newHead;

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
