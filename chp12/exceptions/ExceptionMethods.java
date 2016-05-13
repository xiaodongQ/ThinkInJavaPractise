package chp12.exceptions;

import static myutil.Print.*;

public class ExceptionMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage: " + e.getMessage());
			print(e.getLocalizedMessage());
			print(e.toString());
			e.printStackTrace();
		}

		TestCatchAllException test = new TestCatchAllException();
		try {
			test.throwExceptions(2);
		} catch (Exception e) {
			print(e);
		}
	}
}

class TestCatchAllException {
	public void throwExceptions(int i) throws MyException1, MyException2, MyException3 {
		if (i == 1)
			throw new MyException1();
		else if (i == 2)
			throw new MyException2();
		else
			throw new MyException3();
	}

	class MyException1 extends Exception {

	}

	class MyException2 extends Exception {

	}

	class MyException3 extends Exception {

	}
}
