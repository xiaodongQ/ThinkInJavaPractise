package io;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;
import java.io.*;

public class BufferToText {
	private static final int BSIZE = 1024;
	public static void main(String[] args) throws Exception {
		FileChannel fc = 
				new FileOutputStream("io/data2.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text".getBytes()));
		fc.close();

		fc = new FileInputStream("io/data2.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		// 读取乱码
		System.out.println(buff.asCharBuffer());
		
		// 重置buff到起始
		buff.rewind();
		// 获取文件编码格式
		String encoding = System.getProperty("file.encoding");
		// 使用上述编码对buff进行解码
		System.out.println("Decoding using " + encoding + ": " + 
				Charset.forName(encoding).decode(buff));

		// 写入时按指定编码写入
		fc = new FileOutputStream("io/data2.txt").getChannel();
		fc.write(ByteBuffer.wrap(
				"Some text".getBytes("UTF-16BE")));
		fc.close();
		fc = new FileInputStream("io/data2.txt").getChannel();
		buff.clear();
		fc.read(buff);
		buff.flip();
		System.out.println(buff.asCharBuffer());
	}

}
