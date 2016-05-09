package chp10.innerclass.p1;
import static myutil.Print.*;

public class Line2 {
	public Shape getLine2() {
		// 匿名内部类
		return new Shape() {
			public void draw() {
				print("draw()");
			}
			public void erase() {
				print("erase()");
			}
		};
	}
	public static void main(String[] args) {
		Line2 l2 = new Line2();
		Shape s = l2.getLine2();
		s.draw();
		s.erase();
	}
}
