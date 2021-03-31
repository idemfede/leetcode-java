package ex0019;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

//		8
//		[4,1,8,4,5]
//		[5,6,1,8,4,5]

		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(2);
		ListNode a3 = aP.new ListNode(3);
		ListNode a4 = aP.new ListNode(4);
		ListNode a5 = aP.new ListNode(5);
		ListNode a6 = aP.new ListNode(6);
		ListNode a7 = aP.new ListNode(7);
		ListNode a8 = aP.new ListNode(8);

		a1.next = a2;
//		a1.next = a2;
//		a2.next = a3;
//		a3.next = a4;
//		a4.next = a5;
//		a5.next = a6;
//		a6.next = a7;

		// ListNode a2 = aP.new ListNode(2);
//		ListNode a3 = aP.new ListNode(3);
//		ListNode a4 = aP.new ListNode(4);
//		ListNode a5 = aP.new ListNode(5);
//		ListNode a6 = aP.new ListNode(6);
//		ListNode a7 = aP.new ListNode(7);
//

//		a5.next = a6;
//		a6.next = a7;
//		a7.next = null;

		ListNode detect = aP.removeNthFromEnd(a1, 1);
		detect.print();

	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || (head.next == null && n == 1)) {
			return null;
		}

		ListNode backPointer = head;
		ListNode forwardPointer = head;

		for (int i = 0; i < n; i++) {
			forwardPointer = forwardPointer.next;
		}

		if (forwardPointer == null) {
			return head.next;
		}

		while (forwardPointer.next != null) {
			forwardPointer = forwardPointer.next;
			backPointer = backPointer.next;
		}

		backPointer.next = backPointer.next.next;
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
			System.out.println(val);
		}
	}
}
