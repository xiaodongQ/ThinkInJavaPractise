package chp13.strings;
import static myutil.Print.*;
import java.util.*;

public class BetterRead {
	public static void main(String[] args) {
		Scanner stdin = new Scanner("Sir Robin of Camelot\n22 1.61803");
		print("What is your name?");
		String name = stdin.nextLine();
		print(name);
		print("How old are you? What is your favorite double?");
		int age = stdin.nextInt();
		double favorite = stdin.nextDouble();
		print(age+"\n"+favorite);
		System.out.format("Hi %s.\n", name);
		System.out.format("In 5 years you will be %d.\n", age+5);
		System.out.format("My favorite double is %f.", favorite/2);
		
	}

}
