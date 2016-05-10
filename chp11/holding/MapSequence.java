package chp11.holding;
import static myutil.Print.*;
import java.util.*;

public class MapSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> degree = new HashMap<String, Integer>();
		degree.put("李雷", 90);
		degree.put("张三", 85);
		degree.put("小明", 95);
		print(degree);
		String[] name = (String[]) degree.keySet().toArray(new String[0]);
		print("before sort: " + Arrays.toString(name));
		Arrays.sort(name);
		print("after sort: " + Arrays.toString(name));

		Map<String, Integer> degree2 = new LinkedHashMap<String, Integer>();
		for(String s : name) {
			degree2.put(s, degree.get(s));
		}
		print(degree2);
		print("==================================");

		Set<String> person = new HashSet<String>();
		person.add("张三");
		person.add("陈池");
		person.add("李雷");
		person.add("小明");

		String[] ps = person.toArray(new String[0]);
		print(Arrays.toString(ps));
		Arrays.sort(ps);
		print(Arrays.toString(ps));
		Set<String> person2 = new LinkedHashSet<String>();
		for(String s : ps) {
			person2.add(s);
		}
		print(person2);
	}

}
