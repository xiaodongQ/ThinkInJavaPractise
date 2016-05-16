package chp13.strings;
import java.util.regex.*;
import java.util.*;
import static myutil.Print.*;

public class SplitDemo {
	public static void main(String[] args) {
		String input = 
				"This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		// 限制分为3个
		print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}

}
