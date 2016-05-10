package chp11.holding;
import java.util.*;
import static myutil.Print.*;

public class UniqueWordsMap {

	public static void main(String[] args) {
		Set<String> keySet = new HashSet<String>();
		List<String> keyList = new ArrayList<String>();
		Map<String, Integer> keyMap = new HashMap<String, Integer>();
		Collections.addAll(keySet, 
			"Set <String> words = new Tree Set < String >( String .CASE_INSENSITIVE_ORDER);".split(" "));
		Collections.addAll(keyList, 
			"Set <String> words = new Tree Set < String >( String .CASE_INSENSITIVE_ORDER);".split(" "));
		print("keySet: " + keySet);
		print("keyList: " + keyList);
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			int times = count(keyList, s);
			print(s + ": " + times);
			keyMap.put(s, times);
		}
		print("================================");
		print(keyMap);
	}
	
	public static int count(List<String> list, String s) {
		int n = 0;
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals(s)) {
				n++;
			}
		}
		return n;
	}
}
