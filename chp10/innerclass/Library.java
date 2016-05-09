package chp10.innerclass;
import static myutil.Print.*;

import java.util.Random;

import chp10.innerclass.Book.BookType;

public class Library {
	public class TechBook implements Book {
		public int count() {
			Random random = new Random();
			return random.nextInt(50);
		}
	}
	public static void main(String[] args) {
		Library l = new Library();
		Book book = l.new TechBook();
		print("count is " + book.count());
		Book.BookType.printInfo();
	}
}

interface Book{
	public static class BookType {
		private String desc;
		public void showDesc() {
			print("desc is:" + desc);
		}
		public static void printInfo() {
			print("here is interface Book");
		}
	}
	public int count();
}

