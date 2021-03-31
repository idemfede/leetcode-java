package ex0141;

public class Program {

	public static void main(String[] args) {

//		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
//		System.out.println(findDisappearedNumbers(nums));
	}

	/**
	 * Definition for singly-linked list.
	 * 
	 */
	public boolean hasCycle(ListNode head) {

		if (head == null || head.next == null) {
			return false;
		}

		if (head.next == head) {
			return true;
		}

		ListNode fastPointer = head.next;
		ListNode slowPointer = head;

		while (fastPointer != null && slowPointer != null && fastPointer.next != null && fastPointer != slowPointer) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		return fastPointer == slowPointer;

	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
