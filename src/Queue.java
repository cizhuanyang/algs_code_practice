import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Queue<Item> implements Iterable<Item> {

	private Node first;
	private Node last;
	private int n;

	private class Node {
		Item item;
		Node next;
	}

	public void enqueue(Item item) {
		// 向表尾添加元素
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldlast.next = last;
		}
		n++;
	}

	public Item dequeue() {
		// 从表头删除元素
		Item item = first.item;
		first = first.next;
		n--;
		if (isEmpty()) {
			last = null;
		}
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new Queue<>();
		while (!StdIn.isEmpty()) {
			String string = StdIn.readString();
			queue.enqueue(string);
		}
		while (!queue.isEmpty()) {
			StdOut.println(queue.dequeue());
		}
	}

	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}

	private class QueueIterator implements Iterator<Item> {

		private Node current = first;;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			Item item = current.item;
			current = current.next;
			return item;
		}

	}

}
