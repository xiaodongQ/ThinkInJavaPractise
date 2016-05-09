package chp11.holding;

import java.util.*;
import static myutil.Print.*;

public class TestListIterator {
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(5);
		List<Integer> ints2 = new ArrayList<Integer>(5);
		for(int i=0; i<5; i++) {
			ints.add(i);
		}
		ListIterator<Integer> lit = ints.listIterator();
		while(lit.hasNext()) {
			print(lit.next());
		}
		print("========================");
		while(lit.hasPrevious()) {
			ints2.add((Integer)lit.previous());
		}
		for(Integer i : ints2) {
			print(i);
		}
		print("========================");
		print(ints2.get(3));
	}
}
