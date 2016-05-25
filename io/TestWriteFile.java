package io;
import java.io.*;

public class TestWriteFile {
	static String newfilename = "io/writeFile.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(
				new StringReader(
						BufferedInputFile.read("io/TestWriteFile.java")));
		PrintWriter out = new PrintWriter(newfilename);
		int lineCount = 0;
		String s;
		while((s = in.readLine()) != null) {
			out.println(++lineCount + ": " + s);
		}
		out.close();
		System.out.println(BufferedInputFile.read(newfilename));
	}
}
