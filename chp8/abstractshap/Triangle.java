package chp8.abstractshap;
import static myutil.Print.*;

public class Triangle extends Shape {
	@Override
	public void draw() { print("Triangle.draw()"); }
	@Override
	public void erase() { print("Triangle.erase()"); }
	public void myprint() {
		print("Triangle myprint");
	}
}
