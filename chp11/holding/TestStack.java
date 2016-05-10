package chp11.holding;

import static myutil.Print.*;
import net.mindview.util.*;

public class TestStack {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> sc = new Stack<>();
		sc.push('U');
		sc.push('n');
		sc.push('c');
		print(sc.pop());
		print(sc.pop());
		print(sc.pop());
		sc.push('e');
		sc.push('r');
		sc.push('t');
		print(sc.pop());
		print(sc.pop());
		print(sc.pop());
		sc.push('a');
		print(sc.pop());
		sc.push('i');
		print(sc.pop());
		sc.push('n');
		sc.push('t');
		sc.push('y');
		print(sc.pop());
		print(sc.pop());
		print(sc.pop());
		sc.push('-');
		sc.push('r');
		sc.push('u');
		print(sc.pop());
		print(sc.pop());
		sc.push('l');
		sc.push('e');
		sc.push('s');
		print(sc.pop());
		print(sc.pop());
		print(sc.pop());
		print(sc);
	}
}
