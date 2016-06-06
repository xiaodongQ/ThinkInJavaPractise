package concurrency;

public class TestRunnable {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Test());
			t.start();
		}
	}
}

class Test implements Runnable {
	private static int sequence = 0;
	private final int id = sequence++;
	public Test() {
		System.out.println("Test()");
		run();
		System.out.println("End Test()");
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("Test run() " + id + " ");
			Thread.yield();
		}
	}
}
