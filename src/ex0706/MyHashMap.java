package ex0706;

import java.util.Arrays;

public class MyHashMap {

	public static void main(String[] args) {
		MyHashMap m = new MyHashMap();
		m.put(1, 1);
		m.put(2, 2);
		m.put(3, 3);
		m.put(4, 4);
		m.put(11, 1);
		m.put(12, 2);
		m.put(13, 3);
		m.put(14, 9);
		m.print();
		m.put(14, 19);
		m.print();
		m.remove(1);
		m.print();
		m.remove(2);
		m.print();
		m.remove(14);
		m.print();
//		System.out.println(m.get(13));
//		System.out.println(m.get(1));
//		System.out.println(m.get(14));
	}

	Node[] data;

	/** Initialize your data structure here. */
	public MyHashMap() {
		data = new Node[13];
	}

	/** value will always be non-negative. */
	public void put(int key, int value) {
		int hash = hashCode(key);

		Node pointer = data[hash];

		if (pointer == null) {
			data[hash] = new Node(key, value);
			return;
		}

		boolean contains = pointer.key == key;
		while (pointer.next != null && !contains) {
			pointer = pointer.next;
			contains = pointer.key == key;
		}

		if (contains) {
			pointer.value = value;
		} else {
			pointer.next = new Node(key, value);
		}
	}

	/**
	 * Returns the value to which the specified key is mapped, or -1 if this map
	 * contains no mapping for the key
	 */
	public int get(int key) {
		int hash = hashCode(key);

		Node pointer = data[hash];

		while (pointer != null && pointer.key != key) {
			pointer = pointer.next;
		}

		if (pointer == null) {
			return -1;
		} else {
			return pointer.value;
		}
	}

	/**
	 * Removes the mapping of the specified value key if this map contains a mapping
	 * for the key
	 */
	public void remove(int key) {
		int hash = hashCode(key);

		Node pointer = data[hash];
		Node prevPointer = null;

		while (pointer != null && pointer.key != key) {
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

	private int hashCode(int value) {
		int size = 13;
		int result = value * 1;

		return result % size;
	}

	private void print() {
		System.out.println(Arrays.toString(data));
	}

	class Node {
		int value;
		int key;
		Node next;

		public Node(int key, int value) {
			super();
			this.value = value;
			this.key = key;
		}

		@Override
		public String toString() {

			if (next == null) {
				return "(" + String.valueOf(key) + "," + String.valueOf(value) + ")";
			} else {
				return "(" + String.valueOf(key) + "," + String.valueOf(value) + ")" + "|" + next.toString();
			}
		}

	}

}
