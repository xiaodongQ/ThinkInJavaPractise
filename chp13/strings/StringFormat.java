package chp13.strings;
import java.util.regex.*;

public class StringFormat {
	private int mint;
	private long mlong;
	private float mfloat;
	private double mdouble;
	public StringFormat(int mint, long mlong, float mfloat, double mdouble) {
		this.mint = mint;
		this.mlong = mlong;
		this.mfloat = mfloat;
		this.mdouble = mdouble;
	}
	public String toString() {
		return String.format("mint:%d, mlong:%x, mfloat:%f, mdouble:%f", 
				mint, mlong, mfloat, mdouble);
	}
	public static void main(String[] args) {
		StringFormat sf = new StringFormat(10, 200, 3.4f, 4.5);
		System.out.println(sf);
	}
}

