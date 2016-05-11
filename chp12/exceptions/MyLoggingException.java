package chp12.exceptions;
import java.io.*;
import java.util.logging.*;

public class MyLoggingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException1();
		} catch(MyException1 e) {
			
		}
		System.out.println("================================");
		try {
			throw new MyException2();
		} catch(MyException2 e) {
			
		}
	}

}

class MyException1 extends Exception {
	private static Logger logger = 
			Logger.getLogger("MyLoggingException");
	public MyException1() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}

class MyException2 extends Exception {
	private static Logger logger = 
			Logger.getLogger("MyLoggingException");
	public MyException2() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}