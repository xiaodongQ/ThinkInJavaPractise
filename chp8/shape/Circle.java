package chp8.shape;
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
	
}
