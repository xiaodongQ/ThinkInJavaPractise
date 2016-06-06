package concurrency;
import java.util.concurrent.*;
import java.util.*;

public class TestSleep {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++) {
			try {
				System.out.println(exec.submit(new Task()).get());
			} catch(InterruptedException e) {
				System.out.println("InterruptedException");
			} catch(ExecutionException e) {
				System.out.println("ExecutionException");
			}
		}
		exec.shutdown();
	}

}

class Task implements Callable<String> {
	private static Random random = new Random(47);
	public String call() {
		int sec = random.nextInt(5);
		try {
			TimeUnit.SECONDS.sleep(sec);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		return "sleep time is " + sec;
	}
}