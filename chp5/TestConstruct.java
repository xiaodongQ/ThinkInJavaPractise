package chp5;

public class TestConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n = new Name();
		Name n2 = new Name("newname");
		Name n3 = new Name("hello", 50);
		n.show();
		n2.show();
	}

}

class Name{
	String name;
	Name(){
		System.out.println("默认构造器");
	}
	Name(String name){
		this.name = name;
	}
	Name(String name, int num){
		// 调用其他构造器
		this(name);
		System.out.println("已经调用Name(String)初始化name");
		System.out.println("num is "+num);
	}
	public void show(){
		System.out.println(name);
	}
}
