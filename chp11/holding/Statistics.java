package chp11.holding;
import static myutil.Print.*;
import java.util.*;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		// 随机产生的数，生成该数的次数
		Map<Integer,Integer> m = 
				new TreeMap<Integer,Integer>();
		Map<Integer,Integer> m2 = 
				new TreeMap<Integer,Integer>();
		for(int i=0; i<10000; i++) {
			int r = rand.nextInt(20);
			Integer freq = m.get(r);
			m.put(r, freq == null ? 1 : freq + 1);
		}
		print(m);
		// 根据values排序，暂时借助TreeMap实现
		Collection<Integer> times = m.values();
		print(times);
		for(Integer i : m.keySet()) {
			print(i + ": " + m.get(i));
			m2.put(m.get(i), i);
		}
		print(m2);
	}
}
