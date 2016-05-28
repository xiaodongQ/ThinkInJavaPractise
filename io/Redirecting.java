package io;
import java.io.*;

public class Redirecting {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream("io/Redirecting.java"));
		PrintStream out = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream("io/test.out")));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		}
		System.out.println("hello");
		out.close();
		System.setOut(console);
	}
}
