package chp5;

import java.util.Random;

public class TestArray {
	public static void main(String[] args) {
		String[] strArray = {"str1","str2","str3","str4","str5","str6","str7"};
		Random rand = new Random(47);
		for(int i=0; i<strArray.length; i++) {
			System.out.println("strArray[" + i + "] is " + strArray[i]);
		}
		
		System.out.println("=========================================");
		Book[] book;
		book = new Book[10];
		for(int i=0; i<book.length; i++) {
			book[i] = new Book(String.valueOf(i));
		}
		for(Book b:book) {
			System.out.println(b.getType());
		}
	}
}

class Book {
	String type;
	Book(String str) {
		type = str;
		System.out.println("Book() "+str);
	}
	public String getType() {
		return type;
	}
	public void setType(String str) {
		type = str;
	}
}