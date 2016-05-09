package chp8.shape;
import static myutil.Print.*;

public class Square extends Shape {
	@Override
	public void draw() { print("Square.draw()"); }
	@Override
	public void erase() { print("Square.erase()"); }
}
