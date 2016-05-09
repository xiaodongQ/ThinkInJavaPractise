package chp5;

public class InitField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lang l1 = new Lang();
		System.out.println(""+l1);
		System.out.println(l1);
	}

}

class Lang {
	String type;
	String desc;
	{
		type = new String("Java");
		desc = new String("oop language");
	}
	public String toString() {
		return (new String("type is "+type+",desc is "+desc));
	}
}