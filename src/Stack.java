import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> implements Iterable<Item> {

	private Node<Item> first;
	private int N;

	private class Node<Item> {
		Item item;
		Node<Item> next;
	}

	public void push(Item item) {
		Node<Item> oldfirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldfirst;
		N++;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return N;
	}

	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<>();
		while(!StdIn.isEmpty()) {
			String string=StdIn.readString();
			stack.push(string);
		}
		while(!stack.isEmpty()) {
			StdOut.println(stack.pop());
		}
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator<>(first);
	}

	private class StackIterator<Item> implements Iterator<Item> {

		private Node<Item> current;

		public StackIterator(Node<Item> first) {
			// TODO Auto-generated constructor stub
			current = first;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			Item item = current.item;
			current = current.next;
			return item;
		}

		public void remove() {

		}

	}

}
