package chp13.strings;


public class JudgeRegEx {
	public static void judge(String sentence) {
		boolean b = sentence.matches("[A-Z]\\w+。$");
		System.out.println(sentence + ": " + b);
	}
	public static void main(String[] args) {
		judge("sdfff");
		judge("Fdsjfkdfj。");
	}
}
