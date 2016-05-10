package chp11.holding;
import java.util.*;
import static myutil.Print.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> priorityQueue = 
				new PriorityQueue<Integer>();
//		Queue<Integer> priorityQueue = 
//				new LinkedList<Integer>();
		Random rand = new Random(47);
		for(int i=0; i<10; i++) {
			priorityQueue.offer(rand.nextInt(i+10));
		}
		QueueDemo.printQ(priorityQueue);

		List<Integer> ints = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		QueueDemo.printQ(priorityQueue);
		// 反转
		priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		QueueDemo.printQ(priorityQueue);
		
		String fact = "EDUCATION SHOULD Eschew Obfuscation";
		List<String> strings = Arrays.asList(fact.split(" "));
		PriorityQueue<String> stringPQ = 
				new PriorityQueue<String>(strings);
		QueueDemo.printQ(stringPQ);
		stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		QueueDemo.printQ(stringPQ);
		
		Set<Character> charSet = new HashSet<Character>();
		for(char c : fact.toCharArray()) {
			charSet.add(c);
		}
		PriorityQueue<Character> characterPQ = 
				new PriorityQueue<>(charSet);
		QueueDemo.printQ(characterPQ);
	}
}
