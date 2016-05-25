package io;
import java.io.*;
import java.util.*;

public class TestReadFile {
	public static String reverseRead(String filename) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(filename));
		String s;
		List<String> ls = new LinkedList<String>();
		while((s = in.readLine()) != null) {
			ls.add(s + "\n");
		}
		in.close();
		ListIterator<String> lt = ls.listIterator();
		while(lt.hasNext()) {
			lt.next();
		}
		StringBuilder sb = new StringBuilder();
		while(lt.hasPrevious()) {
			sb.append(lt.previous().toUpperCase());
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print(reverseRead("io/TestReadFile.java"));
	}
}
