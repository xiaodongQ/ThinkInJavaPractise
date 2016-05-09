package chp6;
import chp6.xd.sub.Vector;
import chp6.xd.sub.Book;
import static myutil.Print.*;
import static myutil.Range.*;

public class TestPackage {
	public static void main(String[] args) {
		Book eng = new Book("English");
		eng.showDesc();
		
//		chp6.xd.sub.Vector v = new chp6.xd.sub.Vector();
		Vector v = new Vector();
		v.print();
		print(v);
		int[] arr = range(5);
		for(int i : arr) {
			printnb(i);
		}
	}
}
