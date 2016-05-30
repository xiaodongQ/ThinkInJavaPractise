package io;
import java.util.zip.*;
import java.io.*;

public class GZIPcompress {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(args.length == 0) {
			System.out.println("Usage: \nGZIPcompress file\n");
			System.exit(1);
		}
		BufferedReader in = new BufferedReader(
				new FileReader(args[0]));
		BufferedOutputStream out = new BufferedOutputStream(
				new GZIPOutputStream(
						new FileOutputStream("io/test.gz")));
		System.out.print("Writing file");
		int c;
		while((c = in.read()) != -1) {
			out.write(c);
		}
		in.close();
		out.close();
		
		System.out.print("Reading file");
		BufferedReader in2 = new BufferedReader(
				new InputStreamReader(new GZIPInputStream(
						new FileInputStream("io/test.gz"))));
		String s;
		while((s = in2.readLine()) != null) {
			System.out.print(s);
		}
	}


}
