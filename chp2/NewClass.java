package chp2;

public class NewClass {
	int no;
	char gender;
	static int times;
	
	public void show(){
		System.out.println("no is "+no+", gender is "+gender);
	}
	
	public static void hello(){
		System.out.println("Hello, World!");
	}
	
	public int getTimes(){
		return times;
	}
	
	public void addTimes(){
		times++;
	}
}
