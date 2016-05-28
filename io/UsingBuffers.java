package io;
import java.nio.*;
import static myutil.Print.*;

public class UsingBuffers {
	private static void symmetricScramble(CharBuffer buffer) {
		while(buffer.hasRemaining()) {
			// 设置当前position值为mark
			buffer.mark();
			char c1 = buffer.get();
			char c2 = buffer.get();
			// position回到mark的地方
			buffer.reset();
			// 调用put()和get()都会使position改变
			buffer.put(c2).put(c1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] data = "UsingBuffers".toCharArray();
		ByteBuffer bb = ByteBuffer.allocate(data.length*2);
		CharBuffer cb = bb.asCharBuffer();
		cb.put(data);
		// position回到起始值,丢弃mark
		print(cb.rewind());
		symmetricScramble(cb);
		print(cb.rewind());
		symmetricScramble(cb);
		print(cb.rewind());
	}

}
