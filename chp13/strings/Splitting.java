package chp13.strings;
import java.util.*;

public class Splitting {
	public static String knights = 
			"Hello world! She is from far away, new ... any word ..";
	public static void split(String regex) {
		System.out.println(
			Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
		split("is|any");
		System.out.println(knights.replace("n", "x"));
		System.out.println(knights.replaceFirst("f\\w+", "xd"));
		System.out.println(knights.replaceAll("f\\w+", "xd"));
		System.out.println("================");
		System.out.println(knights.replaceAll("[aeiouAEIOU]", "_"));
	}

}
