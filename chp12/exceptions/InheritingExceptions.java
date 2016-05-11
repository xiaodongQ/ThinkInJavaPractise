package chp12.exceptions;
import static myutil.Print.*;

class SimpleException extends Exception {
	public SimpleException() {}
	public SimpleException(String msg) {
		super(msg);
	}
}

public class InheritingExceptions {
	public void f() throws SimpleException {
		print("Throw SimpleException from f()");
		throw new SimpleException();
	}
	public void g() throws SimpleException {
		print("Throw SimpleException from g()");
		throw new SimpleException("Originated in g()");
	}
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch(SimpleException e) {
			print("Caught it!");
		}
		try {
			sed.g();
		} catch(SimpleException e) {
			e.printStackTrace(System.out);
		}
	}
}
