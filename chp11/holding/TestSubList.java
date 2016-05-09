package chp11.holding;

import java.util.List;
import java.util.ArrayList;

public class TestSubList {
	public static void main(String[] args) {
		ArrayList<Shape> sa = new ArrayList<>();
		sa.add(new Shape("circle"));
		sa.add(new Shape("line"));
		sa.add(new Shape("angle"));
		for(Shape s : sa) {
			System.out.print(s + ", ");
		}
		System.out.println();
		List<Shape> sub = sa.subList(1, 3);
		for(Shape s : sub) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println("sa: " + sa);
		sa.removeAll(sub);
		System.out.println(sa);
	}
}

class Shape {
	private String desc;
	public Shape(String desc) {
		this.desc = desc;
	}
	public String toString() {
		return desc;
	}
}