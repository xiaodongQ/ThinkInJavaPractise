package chp7;
import static myutil.Print.*;

public class SubDetergent extends Detergent {
	SubDetergent() {
		print("SubDetergent construct");
	}
	public void scrub() {
		append("SubDetergent");
		super.scrub();
	}
	public void sterlize() {
		print("this is class SubDetergent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubDetergent sub = new SubDetergent();
		sub.scrub();
		sub.sterlize();
		print(sub);
	}
}