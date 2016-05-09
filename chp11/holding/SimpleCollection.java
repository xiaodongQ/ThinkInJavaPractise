package chp11.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<Integer>();
		Collection<Integer> c2 = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			c.add(i);
			c2.add(i);
		}
		// Set不会添加重复元素
		c.add(5);
		// List不管重复元素，仍旧添加
		c2.add(5);
		for(Integer i : c) {
			System.out.print(i + ",");
		}
		System.out.println();
		for(Integer i : c2) {
			System.out.print(i + ",");
		}
	}
}
