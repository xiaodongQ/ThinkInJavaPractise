package chp12.exceptions;
import static myutil.Print.*;

public class Rethrowing {
	public static void f() throws Exception {
		print("originating the exception in f()");
		throw new Exception("throw from f()");
	}
	public static void g() throws Exception {
		try {
			f();
		} catch(Exception e) {
			print("Inside g(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception {
		try {
			f();
		} catch(Exception e) {
			print("Inside h(), e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch(Exception e) {
			print("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch(Exception e) {
			print("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}

}
