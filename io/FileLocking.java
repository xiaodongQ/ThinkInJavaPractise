package io;
import java.io.*;
import java.nio.channels.*;
import java.util.concurrent.*;

import static myutil.Print.*;

public class FileLocking {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("io/file.txt");
		FileLock fl = fos.getChannel().tryLock();
		if(fl != null) {
			print("Locked File");
			TimeUnit.MILLISECONDS.sleep(1000);
			fl.release();
			print("Released Lock");
		}
		fos.close();
	}
}
