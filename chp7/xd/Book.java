package chp7.xd;
import static myutil.Print.*;

public class Book {
	protected void show() {
		print("protected void show()");
	}
	public void buyBook(int n) {
		print("buy Book: "+n);
	}
	public void sellBook(int n) {
		print("sell Book: "+n);
	}
	public void newBook(Book b) {
		print("need a Book type"+"\ninput type is:"+b);
	}
}
