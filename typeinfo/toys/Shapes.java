package typeinfo.toys;

import static myutil.Print.*;

public class Shapes {
	public static void main(String[] args) {
		Shape obj = new Rhomboid();
		print(obj.getClass().getName());
		print(((Rhomboid) obj).getClass().getName());
		try {
			print(((Circle) obj).getClass().getName());
		} catch (ClassCastException e) {
			print("class cast error");
		}
		if (obj instanceof Rhomboid) {
			print("obj instanceof true");
		}
		print("====================================");
		Shape[] objs = { new Shape(), new Rhomboid(), new Circle() };
		for (Shape s : objs) {
			print(s.getClass().getName());
			s.rotate();
		}
	}
}

class Shape {
	private String desc;

	public void rotate() {
		print("rotate()");
	}
}

class Rhomboid extends Shape {

}

class Circle extends Shape {
	public void rotate() {
		if (this instanceof Circle) {
			print("not rotate()");
		}
	}
}