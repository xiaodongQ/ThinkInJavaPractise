package generics;
import java.util.*;

import myutil.Generator;

public class RandomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T t) {
		storage.add(t);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	
	public static void main(String[] args) {
		RandomList<String> rl = new RandomList<String>();
		for(String s : ("hello, this is a test RandomList".split(" "))) {
			rl.add(s);
		}
		for(int i=0; i<10; i++) {
			System.out.println(rl.select());
		}
		System.out.println("============================");
		RandomList<Integer> ri = new RandomList<Integer>();
		for(int i : Arrays.asList(2,3,4)) {
			ri.add(i);
		}
		for(int i=0; i<10; i++) {
			System.out.println(ri.select());
		}
	}
}
