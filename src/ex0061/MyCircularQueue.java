package ex0061;

public class MyCircularQueue {

	private int[] data;
	private int load;
	private int head = -1;
	private int tail = -1;

	public static void main(String[] args) {

		MyCircularQueue obj = new MyCircularQueue(10);

		obj.enQueue(1);
		obj.enQueue(2);
		obj.enQueue(3);
		obj.enQueue(4);
		obj.enQueue(5);
		obj.enQueue(6);
		obj.enQueue(7);
		obj.enQueue(8);
		obj.enQueue(9);
		obj.enQueue(10);
		obj.enQueue(11);
		obj.enQueue(12);
		obj.enQueue(13);
		obj.enQueue(14);

		obj.deQueue();
		obj.deQueue();
		obj.deQueue();
		obj.deQueue();
		obj.enQueue(100);
		obj.enQueue(101);
		obj.enQueue(102);
		obj.enQueue(103);
		obj.enQueue(104);
		obj.enQueue(105);

	}

	public MyCircularQueue(int k) {
		data = new int[k];
		load = 0;
		head = -1;
		tail = -1;

	}

	public boolean enQueue(int value) {
		if (isEmpty()) {
			head = 0;
			tail = 0;
			data[tail] = value;
			load++;
			return true;
		}

		if (!isFull()) {

			if (tail == data.length - 1) {
				tail = 0;
			} else {
				tail++;
			}
			data[tail] = value;

			load++;
			return true;
		}
		return false;

	}

	public boolean deQueue() {
		if (!isEmpty()) {
			if (head == data.length - 1) {
				head = 0;
			} else {
				head++;
			}
			load--;
			return true;
		}

		return false;

	}

	public int Front() {
		if (head == -1 || isEmpty()) {
			return -1;
		}

		return data[head];
	}

	public int Rear() {
		if (tail == -1 || isEmpty()) {
			return -1;
		}

		return data[tail];

	}

	public boolean isEmpty() {
		return load == 0;
	}

	public boolean isFull() {
		return load == data.length;
	}

	/**
	 * Your MyCircularQueue object will be instantiated and called as such:
	 * MyCircularQueue obj = new MyCircularQueue(k); boolean param_1 =
	 * obj.enQueue(value); boolean param_2 = obj.deQueue(); int param_3 =
	 * obj.Front(); int param_4 = obj.Rear(); boolean param_5 = obj.isEmpty();
	 * boolean param_6 = obj.isFull();
	 */
}
