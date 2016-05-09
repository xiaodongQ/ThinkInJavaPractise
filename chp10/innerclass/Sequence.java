package chp10.innerclass;
import static myutil.Print.*;

interface Selector {
	boolean end();
	Object current();
	void next();
}

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length) {
				i++;
			}
		}
		public Sequence outer() {
			return Sequence.this;	// .this语法
		}
	}
	public Selector selector() {
		return new SequenceSelector();
	}
	private class Reverse implements Selector {
		public boolean end() {
			return i == items.length;
		}
		public Object current() {
			return items[i];
		}
		public void next() {
			if(i < items.length) {
				i++;
			}
		}
		public Sequence outer() {
			return Sequence.this;	// .this语法
		}
		private int i = items.length - 1;
		public boolean begin() {
			return i == 0;
		}
		public void pre() {
			if(i > 0) {
				i--;
			}
		}
	}
	public Selector reverseSelector() {
		return new Reverse();
	}
	class NewClass {
		private String s="hello";
		public String toString() {
			return new String("NewClass:" + s);
		}
	}
	public  NewClass getNewClass() {
		return new NewClass();
	}
	public void show() {
		print("show()");
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0; i<5; i++) {
			sequence.add(Integer.toString(i));
		}
		for(int i=0; i<3; i++)
		{
			sequence.add(sequence.new NewClass());	// .new语法
		}
		Selector selector = sequence.selector();
		while(!selector.end()) {
			print(selector.current() + " ");
			selector.next();
//			((SequenceSelector)selector).outer().show();
		}
		print("==========================================");
		Reverse rselector = (Reverse)sequence.reverseSelector();
		while(!rselector.begin()) {
			print(rselector.current() + " ");
			rselector.pre();
		}
		print(rselector.current() + " ");
	}
}

