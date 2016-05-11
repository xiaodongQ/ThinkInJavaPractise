package chp12.exceptions;

public class WhoCalled {
	static void f() {
		try {
			throw new Exception();
		} catch(Exception e) {
			// 0是栈顶，是调用序列的最后一个方法调用
			for(StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste.getMethodName());
			}
		}
	}
	static void g() { f(); }
	static void h() { g(); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		System.out.println("=======================================");
		g();
		System.out.println("=======================================");
		h();
	}

}