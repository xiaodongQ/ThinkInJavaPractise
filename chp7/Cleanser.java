package chp7;
import static myutil.Print.*;

public class Cleanser {
	Cleanser(int i) {
		print("Cleanser constructor");
	}
	private String s = "Cleanser";
	public void append(String a ) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cleanser x = new Cleanser(1);
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

