package io;
import java.nio.*;
import java.nio.channels.*;

import javax.management.RuntimeErrorException;

import java.io.*;


public class LockingMappedFiles {
	static final int LENGTH = 0x500000;
	static FileChannel fc;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		fc = new RandomAccessFile("io/bigfile.dat", "rw").getChannel();
		MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
		for(int i=0; i<LENGTH; i++) {
			out.put((byte)'x');
		}
		new LockAndModify(out, 0, 0+LENGTH/3);
		new LockAndModify(out, LENGTH/2, LENGTH/2+LENGTH/4);
	}
	private static class LockAndModify extends Thread {
		private ByteBuffer buff;
		private int start, end;
		public LockAndModify(ByteBuffer mbb, int start, int end) {
			// TODO Auto-generated constructor stub
			this.start = start;
			this.end = end;
			mbb.limit(end);
			mbb.position(start);
			buff = mbb.slice();
			start();
		}
		public void run() {
			try {
				FileLock fl = fc.lock(start, end, false);
				System.out.println("Locked: " + start + " to " + end);
				while(buff.position() < buff.limit() - 1) {
					buff.put((byte)(buff.get() + 1));
				}
				fl.release();
				System.out.println("Released: " + start + " to " + end);
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
