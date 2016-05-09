package chp7;
import static myutil.Print.*;

public class TestBaseMethod extends BaseClass {
	public void show(String s) {
		print("this is show(String s)");
	}
	public void show(float f) {
		print("test override base method");
	}
	public static void main(String[] args) {
		TestBaseMethod c = new TestBaseMethod();
		c.show();
		c.show(1);
		c.show((float)0.1);
		c.show("hello");
	}
}

class BaseClass {
	public void show() {
		print("this is show()");
	}
	public void show(int i) {
		print("this is show(int i)");
	}
	public void show(float f) {
		print("this is show(float f)");
	}
	
}