
import java.util.LinkedList;

public class Queue<T> {
	private LinkedList<T> list;

	public Queue() {
		list = new LinkedList<>();
	}

	public void enqueue(T item) {
		list.addLast(item);
	}

	public T dequeue() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return list.removeFirst();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int size() {
		return list.size();
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return list.getFirst();
	}
}