package chp7;
import static myutil.Print.*;
import chp7.xd.*;

public class TestProtected extends Book {
	public void showDesc() {
		//调用基类中的protected方法
//		show();
		print("here is class TestProtected");
	}
	public void newBook(Book b) {
		print("here is class TestProtected");
		print("input type is"+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestProtected tp = new TestProtected();
//		tp.showDesc();
		// 向上转型
		tp.newBook(tp);
		
	}
}
