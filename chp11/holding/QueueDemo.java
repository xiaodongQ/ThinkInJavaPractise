package chp11.holding;

import java.util.*;
import static myutil.Print.*;

public class QueueDemo {
	public static void printQ(Queue queue) {
		while(queue.peek() != null) {
			printnb(queue.remove() + " ");
		}
		print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i=0; i<10; i++) {
			queue.offer(rand.nextInt(i+10));
		}
		printQ(queue);
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Hello World".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}

}
