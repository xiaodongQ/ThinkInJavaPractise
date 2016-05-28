package io;
import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import static myutil.Print.*;


public class LargeMappedFiles {
	static int length = 0xFF;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MappedByteBuffer out = 
			new RandomAccessFile("io/test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
		for(int i=0; i<length; i++) {
			out.put((byte)'x');
		}
		print("Finished writing");
		for(int i=length/2; i<length/2+6; i++) {
			printnb((char)out.get(i));
		}
	}
}
