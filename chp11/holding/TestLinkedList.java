package chp11.holding;

import java.util.LinkedList;
import java.util.ListIterator;
import static myutil.Print.*;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linkInts = new LinkedList<>();
/*		for(int i=0; i<10; i++) {
			linkInts.add(linkInts.size()/2, i);
			print(linkInts);
		}
*/	
		for(int i=0; i<10; i++) {
			ListIterator<Integer> lit = linkInts.listIterator(linkInts.size()/2);
			lit.add(i);
			print(linkInts);
		}
	}
}

