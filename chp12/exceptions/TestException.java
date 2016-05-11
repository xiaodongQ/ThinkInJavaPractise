package chp12.exceptions;
import static myutil.Print.*;

import java.io.*;
import java.util.logging.Logger;

public class TestException {
	private static Logger logger = 
			Logger.getLogger("TestException");
	static void logException(Exception e) {
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException("test MyException");
		} catch(MyException e) {
			e.printStackTrace(System.out);
		} finally {
			System.out.println("finally sub block");
		}
		print("===============================");

		Shape str = null;
		try {
			str.showDesc();
		} catch(NullPointerException e) {
//			print("catch exception: " + e);
			logException(e);
		}
		print("===============================");

		Integer[] ints = new Integer[5];
		for(int i=0; i<5; i++) {
			ints[i] = i;
		}
		try {
			for(int i=0; i<6; i++) {
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			print("caught it: " + e);
		}
		print("mark===============================");
		
		int i = 6;
		while(true) 
		{
			try {
				print(ints[i] + ",");
				break;
			} catch(ArrayIndexOutOfBoundsException e) {
				print("caught it: " + e);
				i--;
			}
		}
	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}

class Shape {
	private String desc;
	public void showDesc() {
		System.out.println(desc);
	}
}