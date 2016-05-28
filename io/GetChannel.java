package io;
import java.nio.*;
import java.nio.channels.*;
import java.io.*;

public class GetChannel {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		// Write a file
		FileChannel fc = 
				new FileOutputStream("io/data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();
		
		// Add to the end of the file
		fc = new RandomAccessFile("io/data.txt", "rw").getChannel();
		fc.position(fc.size());
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
		
		// Read the file
		fc = new FileInputStream("io/data.txt").getChannel();
		// 对只读访问，必须显式分配Bytebuffer
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while(buff.hasRemaining()) {
			// 每次只有一个字节
			System.out.print((char)buff.get());
		}
	}
}
