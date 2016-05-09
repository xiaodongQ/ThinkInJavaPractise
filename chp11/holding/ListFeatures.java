package chp11.holding;

import java.util.*;
import static myutil.Print.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
		List<Integer> integers = new ArrayList<Integer>(7);
		for(int i=0; i<7; i++) {
			integers.add(i);
		}
		print("1: " + integers);
		integers.add(7);
		print("2: " + integers);
		print("3: " + integers.contains(8));
		integers.remove(3);
		print("4: " + integers.get(2) + " " + integers.indexOf(integers.get(2)));
		print("5: " + integers.indexOf(5));
		print("integers: " + integers + " 6: " + integers.remove(5) + " integers: " + integers);
		print("7: " + integers.remove(new Integer(9)));
		print("8: " + integers);
		integers.add(2, 10);
		print("9: " + integers);
		List<Integer> sub = integers.subList(1, 4); // [1,4)
		print("10: " + sub); 
		print("11: " + integers.containsAll(sub));
		Collections.sort(sub);
		print("sorted subList: " + sub);
		print("12: " + integers.containsAll(sub));	// 不管顺序
		Collections.shuffle(sub, rand);
		print("shuffled subList: " + sub);
		print("13: " + integers.containsAll(sub));	// 不管顺序
		integers.add(4);
		List<Integer> copy = new ArrayList<Integer>(integers);
		sub = Arrays.asList(integers.get(1), integers.get(4));
		print("integers: " + integers);
		print("sub: " + sub);
		copy.removeAll(sub);	// 移除sub中元素，重复则全部移除
		print("14: " + copy + " integers: " + integers);
		copy.set(3, 20);
		print("15: " + copy);
		copy.addAll(2, sub);	// 从位置2(0,1,2)开始添加sub中所有元素
		print("16: " + copy);
		print("18: " + integers.isEmpty());
		integers.clear();
		print("19: " + integers);
		print("20: " + integers.isEmpty());
		print("21: " + copy);
		Object[] o = copy.toArray();
		print("22: " + o[3]);
	}
}
