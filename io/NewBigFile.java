package io;
import java.io.*;
//import java.util.*;

public class NewBigFile {
	private static final long SIZE = 0x500000;  // 5M
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("io/bigfile.dat");
		for(long i=0; i<SIZE; i++) {
			fos.write((int)i);
		}

	}

}
