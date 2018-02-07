import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ResizingArrayStack<Item> implements Iterable<Item> {
	private Item[] items = (Item[]) new Object[1];
	private int num = 0;// 栈内元素的数量<=items.length

	public Item pop() {
		Item item = items[--num];//items[--num]不正确
		items[num]=null;
		if (num > 0 && num == items.length / 4) {
			resize(items.length / 2);
		}
		return item;
	}

	public void push(Item item) {
		if (items.length == num) {
			resize(2 * items.length);
		}
		items[num++] = item;
	}

	public void resize(int newSize) {
		Item[] newitems = (Item[]) new Object[newSize];
		for (int i = 0; i < num; i++) {
			newitems[i] = items[i];
		}
		items = newitems;
	}

	public boolean isEmpty() {
		return num == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResizingArrayStack<String> resizingArrayStack=new ResizingArrayStack<>();
		while(!StdIn.isEmpty()) {
			String string=StdIn.readString();
			resizingArrayStack.push(string);
		}
		while(!resizingArrayStack.isEmpty()) {
			StdOut.println(resizingArrayStack.pop());
		}
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new ResizingArrayStackIterator();
	}
	
	private class ResizingArrayStackIterator implements Iterator<Item>{
		private int i=num;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i>0;
		}

		@Override
		public Item next() {
			// TODO Auto-generated method stub
			return items[num--];
		}
		public void remove() {
			
		}
		
	}
}
