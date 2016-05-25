package io;
import java.io.*;

public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			DataInputStream in = new DataInputStream(
				new ByteArrayInputStream(
					BufferedInputFile.read("io/FormattedMemoryInput.java").getBytes()));
			int i;
			while((i = in.available()) != 0) {
				System.out.print((char)in.read());
			}
			in.close();
		} catch(EOFException e) {
			System.out.println("End of stream");
		}
	}
}
