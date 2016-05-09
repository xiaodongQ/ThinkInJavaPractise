package chp7;
import static myutil.Print.*;

public class Detergent {
	//代理
	private Cleanser cl = new Cleanser(1);
	public void append(String a ) { 
		cl.append(a); 
	}
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return cl.toString(); }
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}

//public class Detergent extends Cleanser {
//	private AnotherClass another; 
//	Detergent() {
//		super(1);
//		another = new AnotherClass(50);
//		print("Detergent constructor");
//	}
//	public void scrub() {
//		append(" Detergent.scrub()");
//		super.scrub();
//	}
//
//	public void foam() {
//		append(" foam()");
//	}
//	
//	public static void main(String[] args) {
////		Detergent x = new Detergent();
////		x.dilute();
////		x.apply();
////		x.scrub();
////		x.foam();
////		print(x);
////		print("Testing base class:");
////		Cleanser.main(args);
//		Detergent deter = new Detergent(); //基类构造器在本类中AnotherClass之前已经完成了调用!
//	}
//}
