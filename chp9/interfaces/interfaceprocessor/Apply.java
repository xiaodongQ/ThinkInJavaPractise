package chp9.interfaces.interfaceprocessor;
import static myutil.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
	public static String s = "Disagreement with beliefs is by definition incorrect";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
