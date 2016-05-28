package io;

import java.io.*;

public class Echo {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader stdin = new BufferedReader(
				new FileReader("io/Echo.java"));
		String s;
		while ((s = stdin.readLine()) != null && s.length() != 0) {
			System.out.println(s);
		}
	}
}
