package chp9.interfaces.car;
import static myutil.Print.*;

public abstract class Car {
	public Car() {
		print("class Car");
	}
	public static void main(String[] args) {
		Jeep j = new Jeep();
		j.fun1(j);
		j.fun2(j);
		j.fun3(j);
		j.fun(j);
	}
}

class Jeep extends Car implements Fun {
	public Jeep() {
		print("class Jeep");
	}
	public void f1() {}
	public void f2() {}
	public void f3() {}
	public void f4() {}
	public void f5() {}
	public void f6() {}
	public void f7() {}
	public void fun1(Fun1 f) {
		print("fun1 requires Fun1");
	}
	public void fun2(Fun2 f) {
		print("fun2 requires Fun2");
	}
	public void fun3(Fun3 f) {
		print("fun3 requires Fun3");
	}
	public void fun(Fun f) {
		print("fun requires Fun");
	}
}

interface Fun1 {
	public void f1();
	public void f2();
}

interface Fun2 {
	public void f3();
	public void f4();
}

interface Fun3 {
	public void f5();
	public void f6();
}

// 接口的继承有误，直接extends
//interface Fun extends Fun1 implements Fun2,Fun3 {
interface Fun extends Fun1,Fun2,Fun3 {
	public void f7();
}