package chp5;

public class TerminationCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tank(false);
		new Tank(true);
		System.gc();
		System.out.println("end");
	}

}

class Tank {
	boolean full;
	Tank(boolean state) {
		full = state;
	}
	void fill() {
		full = true;
	}
	protected void finalize() {
		if(!full) {
			System.out.println("when empty, clean");
		}
	}

}