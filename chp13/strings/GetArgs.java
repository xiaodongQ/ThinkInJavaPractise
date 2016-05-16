package chp13.strings;

public class GetArgs {
	private int mint;
	private long mlong;
	private float mfloat;
	private double mdouble;
	private String mstring;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetArgs a = new GetArgs("5 50 3.4f 5.67d hello");
		System.out.println(a);
	}
	public GetArgs(String s) {
		String[] strs = s.split(" ");
		String ret;
		mint = Integer.parseInt(strs[0]);
		mlong = Integer.parseInt(strs[1]);
		mfloat = Float.parseFloat(strs[2]);
		mdouble = Double.parseDouble(strs[3]);
		mstring = strs[4];
	}
	public String toString() {
		return "mint:" + mint + " mlong:" + mlong + " mfloat:" +
				mfloat + " mdouble:" + mdouble + " mstring:" + mstring;
	}

}
