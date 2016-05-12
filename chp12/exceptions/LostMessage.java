package chp12.exceptions;

public class LostMessage {
	void f() throws VeryImportantException {
		throw new VeryImportantException(); 
	}
	void dispose() throws HohumException {
		throw new HohumException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			LostMessage lm = new LostMessage();
			try {
				lm.f();
			} finally {
				try {
					lm.dispose();
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HohumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}