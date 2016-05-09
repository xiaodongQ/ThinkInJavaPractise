package chp8.abstractshap;
import static myutil.Print.*;

public class Circle extends Shape {
	@Override
	public void draw() { print("Circle.draw()"); }
	@Override
	public void erase() { print("Circle.erase()"); }
	@Override 
	public void show() {
		print("here is Circle show()");
	}
	public void roll() {
		print("roll extend method");
	}
	@Override
	public void myprint() {
		print("Circle myprint");
	}
	
}
