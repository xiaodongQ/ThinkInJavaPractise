package chp9.myinterface;
import chp9.myinterface.shape.*;
import static myutil.Print.*;

public class Circle implements Shape {
	public void show() {
		print("Circle show()");
	}
	public void draw() {
		print("Circle draw()");
	}
	public void erase() {
		print("Circle erase()");
	}
}
