package ex0707;

public class MyLinkedList {

	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtTail(1);
		myLinkedList.print();

	}

//	Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
//	A node in a singly linked list should have two attributes: val and next. val is the value of the current node, 
//	and next is a pointer/reference to the next node.
//	If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. 
//	Assume all nodes in the linked list are 0-indexed.
//
//	Implement the MyLinkedList class:
//
//	MyLinkedList() Initializes the MyLinkedList object.
//	int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
//	void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, 
//	the new node will be the first node of the linked list.
//	void addAtTail(int val) Append a node of value val as the last element of the linked list.
//	void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length
//	of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
//	void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.

	int size = 0;
	Node head = null;

	/** Initialize your data structure here. */
	public MyLinkedList() {
	}

	private void print() {
		Node position = head;

		while (position != null) {
			System.out.println(position.value);
			position = position.next;
		}

	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {

		if (index > size - 1) {
			return -1;
		}

		if (head == null) {
			return -1;
		}

		int i = 0;
		Node ret = head;

		while (i != index) {
			ret = ret.next;
			i++;
		}

		return ret.value;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		Node newHead = new Node();
		newHead.value = val;
		newHead.next = head;

		head = newHead;
		size++;

	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		if (head == null) {
			addAtHead(val);
			return;
		}

		Node tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}

		Node newTail = new Node();
		newTail.value = val;
		tail.next = newTail;
		size++;

	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		if (size == 0 || index == 0) {
			addAtHead(val);
			return;
		}

		if (index == size) {
			addAtTail(val);
			return;
		}

		if (index > size) {
			return;
		}

		Node position = head;
		int i = 0;
		while (i < index - 1) {
			position = position.next;
			i++;
		}

		Node newNode = new Node();
		newNode.value = val;
		newNode.next = position.next;

		position.next = newNode;
		size++;

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		if (index > size - 1) {
			return;
		}

		if (index == 0) {
			size--;
			head = head.next;
			return;
		}

		Node position = head;
		int i = 0;
		while (i < index - 1) {
			position = position.next;
			i++;
		}

		position.next = position.next.next;

		size--;
	}

	class Node {
		int value;
		Node next;

		void print() {
			System.out.println(value);
		}
	}

}
