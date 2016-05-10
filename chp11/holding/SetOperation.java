package chp11.holding;
import static myutil.Print.*;

import java.util.*;

public class SetOperation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
		set1.add("M");
		print("set1: " + set1);
		print("H: " + set1.contains("H"));
		print("N: " + set1.contains("N"));
		
		Set<String> set2 = new TreeSet<String>();
		Collections.addAll(set2, "H,I,J,K,L".split(","));
		print("set2: " + set2);
		print("set2 in set1:" + set1.containsAll(set2));
		
		set1.remove("H");
		print("set2 in set1:" + set1.containsAll(set2));
		
		set1.removeAll(set2);
		print("set1: " + set1);
		
		Collections.addAll(set1, "X Y Z".split(" "));
		print("set1: " + set1);
	}

}
