package chp11.holding;
import java.util.*;
import static myutil.Print.*;

public class UniqueWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		Collections.addAll(words, "A B C D E ab efd Adf".split(" "));
		System.out.println(words);
		print("================================");
		Set<String> keycount = new HashSet<String>();
		Collections.addAll(keycount, 
			"Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);".split(" "));
		print(keycount);
		Iterator<String> it = keycount.iterator();
		int totals = 0;
		while(it.hasNext()) {
			String s = it.next();
			totals += count(s);
			print(s + ": " + count(s));
		}
		print("totals: " + totals);
		print("====================================");
		totals = 0;
		it = keycount.iterator();
		while(it.hasNext()) {
			String s = it.next();
			totals += count(s, new HashSet('a','A'));
			print("totals 'a','A': " + totals);
		}
		
	}
	
	public static int count(String s) {
		int n = 0;
		for(char c : s.toCharArray()) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
					c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
				n++;
		}
		return n;
	}
	public static int count(String s, Set<Character> t) {
		int n = 0;
		Iterator<Character> it = t.iterator();
		for(char c : s.toCharArray()) {
			while(it.hasNext()) {
				it.next();
				if(it.equals(c)) {
					n++;
				}
			}
		}
		return n;
	}
}
