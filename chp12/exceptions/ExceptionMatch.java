package chp12.exceptions;

public class ExceptionMatch {
	public static void main(String[] args) {
		A obj = new C();
		try {
			obj.func();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			for(StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
			e.printStackTrace();
		}
	}

}

class A {
	public void func() throws E1 {
		throw new E1();
	}
}
class B extends A {
	public void func() throws E2 {
		throw new E2();
	}
}
class C extends B {
	public void func() throws E3 {
		throw new E3();
	}
}

class E1 extends Exception {}
class E2 extends E1 {}
class E3 extends E2 {}