package chp10.innerclass.exercise;
import static myutil.Print.*;

interface U {
	public void fun1();
	public void fun2();
	public void fun3();
}

class A {
	public U getU() {
		return new U() {
			public void fun1() {
				print("A fun1()");
			}
			public void fun2() {
				print("A fun2()");
			}
			public void fun3() {
				print("A fun3()");
			}
		};
	}
}

class B {
	private U[] arr;
	private int i = 0;
	private int size =5;
	B() {
		arr = new U[size];
	}
	public void add(U u) {
		if(i < arr.length){
			arr[i++] = u;
		}
	}
	public void setNull(int i) {
		arr[i] = null;
	}
	public void listArr() {
		for(int i=0; i<arr.length; i++) {
			print("arr[" + i + "]: " + arr[i]);
		}
	}
}
public class ArrayExercise {
	public static void main(String[] args) {
		A[] arrA = {
				new A(),
				new A(),
				new A(),
				new A(),
				new A()
		};
		B b = new B();
		for(int i=0; i<arrA.length; i++) {
			b.add(arrA[i].getU());
		}
		b.listArr();
		b.setNull(2);
		b.listArr();
	}
}
