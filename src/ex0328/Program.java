package ex0328;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(2);
		ListNode a3 = aP.new ListNode(3);
		ListNode a4 = aP.new ListNode(4);
		ListNode a5 = aP.new ListNode(5);
		ListNode a6 = aP.new ListNode(6);
		ListNode a7 = aP.new ListNode(7);
		ListNode a8 = aP.new ListNode(8);
		ListNode a9 = aP.new ListNode(9);
		ListNode a10 = aP.new ListNode(10);
		ListNode a11 = aP.new ListNode(11);
		ListNode a12 = aP.new ListNode(12);

		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;
		a7.next = a8;
		a8.next = a9;
		a9.next = a10;
		a10.next = a11;
		a11.next = a12;

		ListNode detect = aP.oddEvenList(a1);
		detect.print();

	}

	public ListNode oddEvenList(ListNode head) {

		if (head == null || head.next == null || head.next.next == null) {
			return head; // size 0,1,2
		}

		ListNode oddTail = head;
		ListNode oddPointer = head.next.next;
		ListNode evenHead = head.next;
		ListNode e = head.next;

		while (oddPointer != null && oddPointer.next != null) {
			oddTail.next = oddPointer;
			e.next = oddPointer.next;
			e = oddPointer.next;
			oddTail = oddPointer;

			oddPointer = oddPointer.next.next;

		}

		if (oddPointer != null && oddPointer.next == null) {
			e.next = null;
			oddTail.next = oddPointer;
			oddTail = oddTail.next;
		}

		oddTail.next = evenHead;
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
