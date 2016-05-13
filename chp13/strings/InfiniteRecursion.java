package chp13.strings;
import java.util.*;

public class InfiniteRecursion {
	public String toSring() {
//		return " InfiniteRecursion address: " + this + "\n";
		return super.toString();
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = 
				new ArrayList<>();
		for(int i=0; i<3; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}

}
