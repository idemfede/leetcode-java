package ex0160;

public class Program {

	public static void main(String[] args) {

		Program aP = new Program();

//		8
//		[4,1,8,4,5]
//		[5,6,1,8,4,5]

		ListNode a0 = aP.new ListNode(4);
		ListNode a1 = aP.new ListNode(1);
		ListNode a2 = aP.new ListNode(8);
		ListNode a3 = aP.new ListNode(4);
		ListNode a4 = aP.new ListNode(5);
		ListNode a5 = aP.new ListNode(5);
		ListNode a6 = aP.new ListNode(6);
		ListNode a7 = aP.new ListNode(1);

		a0.next = a1;
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;

		a5.next = a6;
		a6.next = a7;
		a7.next = a2;

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

		ListNode detect = aP.getIntersectionNode(a0, a5);
		detect.print();

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null) {
			return null;
		}

		ListNode slowPointer = headA;
		ListNode fastPointer = headB;
		ListNode tailB = null;

		// search for tails
		while (slowPointer.next != null) {
			slowPointer = slowPointer.next;
		}
		while (fastPointer.next != null) {
			fastPointer = fastPointer.next;
		}

		if (slowPointer != fastPointer) {
			return null;
		}

		tailB = slowPointer;
		tailB.next = headB;

		// search for loop
		slowPointer = headA;
		fastPointer = headA;

		while (fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

			if (slowPointer == fastPointer) {

				ListNode loopPointer = headA;

				while (loopPointer != slowPointer) {
					loopPointer = loopPointer.next;
					slowPointer = slowPointer.next;
				}

				tailB.next = null;
				return slowPointer;
			}
		}

		tailB.next = null;
		return null;

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
