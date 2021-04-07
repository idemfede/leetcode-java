package ex705;

import java.util.Arrays;

public class MyHashSet {

	public static void main(String[] args) {

	}

	Node[] data;

	/** Initialize your data structure here. */
	public MyHashSet() {
		data = new Node[13];
	}

	private int hashCode(int value) {
		int size = 13;
		int result = value * 1;

		return result % size;
	}

	public void add(int key) {

		int hash = hashCode(key);

		Node pointer = data[hash];

		if (pointer == null) {
			data[hash] = new Node(key);
			return;
		}

		boolean contains = pointer.value == key;
		while (pointer.next != null && !contains) {
			pointer = pointer.next;
			contains = pointer.value == key;
		}

		if (!contains) {
			pointer.next = new Node(key);
		}

	}

	public void remove(int key) {
		int hash = hashCode(key);

		Node pointer = data[hash];
		Node prevPointer = null;

		while (pointer != null && pointer.value != key) {
			prevPointer = pointer;
			pointer = pointer.next;

		}

		if (pointer != null) {
			Node temp = pointer.next;
			if (prevPointer != null) {
				prevPointer.next = temp;
			} else {
				data[hash] = temp;
			}
		}

	}

	/** Returns true if this set contains the specified element */
	public boolean contains(int key) {
		int hash = hashCode(key);

		Node pointer = data[hash];

		while (pointer != null && pointer.value != key) {
			pointer = pointer.next;
		}

		return pointer != null;
	}

	private void print() {
		System.out.println(Arrays.toString(data));
	}

	class Node {
		int value;
		Node next;

		public Node(int value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {

			if (next == null) {
				return String.valueOf(value);
			} else {
				return String.valueOf(value) + "|" + next.toString();
			}
		}

	}

}
