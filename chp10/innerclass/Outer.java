package chp10.innerclass;
import static myutil.Print.*;

public class Outer {
	private String str;
	Outer(String s) {
		str = s;
	}
	class Inner {
		public void desc() {
			print("class Inner");
		}
		// 内部类具有访问外部类成员的权限
		public String toString() {
			return str;
		}
	}
	public Inner getInner() {
		return new Inner();
	}
	class NewClass {
		private String s="hello";
		public String toString() {
			return "NewClass toString " + s;
		}
	}
	public NewClass getNewClass() {
		return new NewClass();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer("language Java");
		// need object to invoke getInner(), or set getInner() to static 
		Outer.Inner obj = out.getInner();
		obj.desc();
		print(obj.toString());
		NewClass[] news = new NewClass[5];
		for(int i=0; i<5; i++) {
			// 错误，需要外部类的实例来创建内部类对象
//			news[i] = new Outer.NewClass();
			news[i] = out.getNewClass();
			news[i] = out.new NewClass();	//.new语法
		}
	}

}
