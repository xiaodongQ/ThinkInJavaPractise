package chp8;
import static myutil.Print.*;

public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
			new Composing(shared),
			new Composing(shared),
			new Composing(shared),
			new Composing(shared),
			new Composing(shared),
		};
		new Composing(shared);
		for(int i=0; i<composing.length; i++) {
			composing[i].dispose();
		}
		System.gc();
//		shared.finalize();
	}
}

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		print("Create " + this);
	}
	public void addRef() {
		refcount++;
	}
	protected void dispose() {
		if(--refcount == 0) {
			print("Dispose " + this);
		}
	}
	public String toString() {
		return "Shared " + id;
	}
	protected int getRefcount() {
		return refcount;
	}
	// 未触发 why？
	protected void finalize() {
		if(refcount == 0) {
			print("refcounter is 0, enable dispose Shared");
		}
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared) {
		print("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		print("disposing " + this);
		shared.dispose();
	}
	public String toString() {
		return "Composing " + id;
	}
}
