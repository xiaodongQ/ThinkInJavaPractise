package io;
import java.io.*;

public class BasicFileOutput {
	static String file = "BasicFileOutput.out";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(
				new StringReader(BufferedInputFile.read("io/BasicFileOutput.java")));
		PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
		int lineCount = 1;
		String s;
		while((s = in.readLine()) != null) {
			out.println(lineCount++ + ": " + s);
		}
		out.close();
		System.out.print(BufferedInputFile.read(file));
	}
}
