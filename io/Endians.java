package io;
import java.nio.*;
import java.util.*;
import static myutil.Print.*;

public class Endians {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ByteBuffer bb = ByteBuffer.wrap(new byte[12]);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
		bb.rewind();
		// 高位优先/大端,ByteBuffer默认为此
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));

		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("abcdef");
		print(Arrays.toString(bb.array()));
	}
}
