package ex0203;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

//		8
//		[4,1,8,4,5]
//		[5,6,1,8,4,5]

		ListNode a0 = aP.new ListNode(0);
		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(2);
		ListNode a3 = aP.new ListNode(3);
		ListNode a4 = aP.new ListNode(4);
		ListNode a5 = aP.new ListNode(5);
		ListNode a6 = aP.new ListNode(6);
		ListNode a7 = aP.new ListNode(7);

		a0.next = a1;
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = a7;

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

		ListNode detect = aP.reverseList(a0);
		detect.print();

	}

	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return null;
		}

		ListNode pointer = head.next;
		ListNode newHead = head;

		while (pointer != null) {
			head.next = pointer.next;
			pointer.next = newHead;
			newHead = pointer;
			pointer = head.next;
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
			System.out.println(val);
		}
	}
}
