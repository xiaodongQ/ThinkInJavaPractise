package chp7;

public class TestFinal extends Book {
//	@Override
	private final void desc() {
		System.out.println("TestFinal desc()");
	}
	public void sell(String s) {
		System.out.println("TestFinal sell()");
	}
//	private int a = returnInt();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinal f = new TestFinal();
		System.out.println(f.PI);
		System.out.println(f.num);
		System.out.println(Book.PI);
		TestFinal f2 = new TestFinal();
	}
}

class Book {
	public final int num = 20;
	public static final float PI = 3.14f;
	private final void desc() {
		System.out.println("Book desc()");
	}
	public final void sell() {
		System.out.println("Book sell()");
	}
	public int returnInt() {
		System.out.println("returnInt()");
		return 5;
	}
}