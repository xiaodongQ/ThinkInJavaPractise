package chp12.exceptions;

public class TestThrows {
	public static void throwException() throws MyException,NullPointerException {
		throw new MyException("MyException");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throwException();
		} catch(MyException e) {
			e.printStackTrace(System.out);
			System.out.println("here " + e);
		}
	}
}
