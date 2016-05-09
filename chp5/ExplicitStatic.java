package chp5;

public class ExplicitStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insid main()");
		Cups.cup1.f(99);
	}

}

class Cup {
	Cup(int marker) {
		System.out.println("Cup(" + ")");
	}
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}