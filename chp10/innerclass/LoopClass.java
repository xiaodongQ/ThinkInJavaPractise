package chp10.innerclass;
import static myutil.Print.*;

public class LoopClass {
	private static class Shape {
		private String desc;
		Shape(String s) {
			desc = s;
		}
		private void showDesc() {
			print(desc);
		}
		private static class InnerShape {
			private int a;
			private void printA() {
				print(a);
			}
		}
	}
	public static void main(String[] args) {
		Shape s = new Shape("new");
		s.showDesc();
		// 嵌套内部类中还有嵌套内部类，需加类名修饰
		// 生成类文件名: LoopClass$Shape$InnerShape
		Shape.InnerShape is = new Shape.InnerShape();
		is.printA();
	}
}

