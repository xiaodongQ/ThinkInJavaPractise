package io;
import java.io.*;
import java.util.*;
import static myutil.Print.*;

class Data implements Serializable {
	private int n;
	public Data(int n) {
		this.n = n;
	}
	public String toString() {
		return Integer.toString(n);
	}
}

public class Worm implements Serializable {
	private static Random rand = new Random(47);
	private Data[] d = {
			new Data(rand.nextInt(10)),
			new Data(rand.nextInt(10)),
			new Data(rand.nextInt(10))
	};
	private Worm next;
	private char c;
	public Worm(int i, char x) {
		print("Worm constructor: " + i);
		c = x;
		if(--i > 0) {
			next = new Worm(i, (char)(x + 1));
		}
	}
	public Worm() {
		print("Default constructor");
	}
	public String toString() {
		StringBuilder result = new StringBuilder(": ");
		result.append(c + "(");
		for(Data dat : d) {
			result.append(dat);
		}
		result.append(")");
		if(next != null) {
			result.append(next);
		}
		return result.toString();
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Worm w = new Worm(6, 'a');
		ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("io/worm.out"));
		out.writeObject("Worm storage\n");
		out.writeObject(w);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("io/worm.out"));
		String s = (String) in.readObject();
		Worm w2 = (Worm) in.readObject();
		print(s + "w2 = " + w2);
		print("==============================");

		ByteArrayOutputStream bout = 
				new ByteArrayOutputStream();
		ObjectOutputStream out2 = new ObjectOutputStream(bout);
		out2.writeObject("Worm storage\n");
		out2.writeObject(w);
		out2.flush();
		ObjectInputStream in2 = new ObjectInputStream(
				new ByteArrayInputStream(bout.toByteArray()));
		s = (String) in2.readObject();
		Worm w3 = (Worm) in2.readObject();
		print(s + "w3 = " + w3);
		
	}

}

