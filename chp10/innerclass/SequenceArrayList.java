package chp10.innerclass;
import static myutil.Print.*;

import java.util.ArrayList;
import java.util.Iterator;

interface Selector2 {
	boolean end();
	Object current();
	void next();
}

public class SequenceArrayList {
	private ArrayList<Object> items = new ArrayList<Object>();
	private int next = 0;
	public void add(Object x) {
		items.add(x);
	}
	private class SequenceSelector implements Selector2 {
		private int i = 0;
		public boolean end() {
			return i == items.size();
		}
		public Object current() {
			return items.get(i);
		}
		public void next() {
			i++;
		}
		public SequenceArrayList outer() {
			return SequenceArrayList.this;	// .this语法
		}
	}
	public Selector2 selector() {
		return new SequenceSelector();
	}
	public Iterator<Object> getIterator() {
		return items.iterator();
	}
	class NewClass {
		private String s="hello";
		public String toString() {
			return new String("NewClass:" + s);
		}
	}
	public void show() {
		print("show()");
	}
	public static void main(String[] args) {
		SequenceArrayList sequence = new SequenceArrayList();
		for(int i=0; i<5; i++) {
			sequence.add(Integer.toString(i));
		}
		for(int i=0; i<3; i++)
		{
			sequence.add(sequence.new NewClass());	// .new语法
		}
		sequence.add("here");
		Selector2 selector = sequence.selector();
		while(!selector.end()) {
			print(selector.current() + " ");
			selector.next();
//			((SequenceSelector)selector).outer().show();
		}
		print("==========================================");
		Iterator<Object> it = sequence.getIterator();
		while(it.hasNext()) {
			Object o = it.next();
			print(o);
		}
	}
}
