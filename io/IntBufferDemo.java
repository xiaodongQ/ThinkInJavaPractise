package io;
import java.nio.*;

public class IntBufferDemo {
	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.allocate(BSIZE);
		IntBuffer ib = bb.asIntBuffer();
		ib.put(new int[]{ 11, 23, 43, 54, 439});
		System.out.println(ib.get(3));
		ib.put(3, 90);
		// 限制为当前位置,位置置为起始
		ib.flip();
		while(ib.hasRemaining()) {
			int i = ib.get();
			System.out.println(i);
		}
	}
}
