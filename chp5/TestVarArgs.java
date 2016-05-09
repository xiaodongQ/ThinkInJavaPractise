package chp5;

public class TestVarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgs va = new VarArgs();
//		char[] charArr = "abc"; // 不允许String到char[]
		char[] charArr = {'a','b','c','d'};
		va.showVar("hello", "ds", "sdlf", "sflkj");
		va.showArrayVar(charArr);
		VarArgs.main(1, 2, "str1", "str2", "str3");
		System.out.println("\n==================================");
		System.out.println(Week.SAT.values());
		System.out.println(Week.SAT.ordinal());
	}

}

class VarArgs {
	public void showVar(String... strings) {
		for(String s:strings) {
			System.out.println(s);
		}
	}
	public void showArrayVar(char[] chars) {
		for(Character c:chars) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	public static void main(int a1, float a2, String... args) {
		System.out.println("the arguments is: "+a1+","+a2);
		for(String s:args) {
			System.out.printf(" and %s", s);
		}
	}
}

enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

