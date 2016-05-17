package typeinfo;

import java.lang.reflect.Field;

public class PrintExtendClasses {
	public static void printClasses(Object obj) {
		Class c = obj.getClass();
		while(c != null) {
			System.out.println(c.getName());
			c = c.getSuperclass();
		}
	}
	public static void printFields(Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field f : fields) {
			System.out.println("field: " + f.getName() + 
					", type: " + f.getType());
		}
	}
	public static void isArrayObject() {
		char[] chs = {'a', 'b', 'c'};
		System.out.println(chs instanceof Object);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printClasses("hello");
		System.out.println();
		printClasses(new Circle2());
		System.out.println();
		printFields(new Shape());
		System.out.println();
		isArrayObject();
	}
}

class Shape {
	private String m1;
	private int m2;
	private double m3;
}
class Circle extends Shape {}
class Circle1 extends Circle {}
class Circle2 extends Circle {}
