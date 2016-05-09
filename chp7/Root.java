package chp7;
import static myutil.Print.*;

class Stem extends Root {
	Stem() {
		super(1);
		print("Stem Constructor");
	}
	Component1 c1 = new Component1(1);
	Component2 c2 = new Component2(2);
	Component3 c3 = new Component3(3);
	public void dispose() {
		print("release Stem");
		c3.dispose();
		c2.dispose();
		c1.dispose();
		super.dispose();
	}
}

public class Root {
	Root(int i) {
		print("Root(int i) Constructor");
	}
			
	Component1 c1 = new Component1(4);
	Component2 c2 = new Component2(5);
	Component3 c3 = new Component3(6);
	public static void main(String[] args) {
		Stem st = new Stem();
		try {
			
		} finally {
			st.dispose();
		}
	}
	public void dispose() {
		print("release Root");
		c3.dispose();
		c2.dispose();
		c1.dispose();
	}
}

class Component1 {
	Component1(int is) {
		print("Component1 Constructor"+is);
	}
	public void dispose() {
		print("release Commponent1");
	}
}

class Component2 {
	Component2(int is) {
		print("Component2 Constructor"+is);
	}
	public void dispose() {
		print("release Commponent2");
	}
}

class Component3 {
	Component3(int is) {
		print("Component3 Constructor"+is);
	}
	public void dispose() {
		print("release Commponent3");
	}
}