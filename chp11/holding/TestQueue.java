package chp11.holding;
import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(CommandSelector.fill(new Command("hello")));
		test(null);
	}
	public static void test(Queue q) {
		if(q == null || q.isEmpty()) {
			System.out.println("the queue is null or empty!");
			return;
		}
		Command c = (Command) q.remove();
		c.operation();
	}
}

class Command {
	private String command;
	public Command(String command) {
		this.command = command;
	}
	public void operation() {
		System.out.println("command: " + command);
	}
}

class CommandSelector {
	private static Queue<Command> qc = new LinkedList<Command>();
	public static Queue fill(Command c) {
		qc.offer(c);
		return qc;
	}
}