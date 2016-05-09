package chp8;

public class TestMulti {
/*	public static void ride(Cycle c) {
		System.out.println("Cycle ride() "+c.getClass().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unicycle u = new Unicycle();
		Cycle c = new Cycle();
		Bicycle b = new Bicycle();
		Tricycle t = new Tricycle();
		ride(u);
		ride(c);
		ride(b);
	}
*/
	public static void show(Cycle c) {
		System.out.println(c.getClass().getName());
	}
	public static void main(String[] args) {
		Cycle c = new Unicycle();
		c.ride();
	}
}

class Cycle {
	public Cycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Cycle()");
	}
	public void start() {
		System.out.println("Cycle start()");
	}
	public void ride() {
		start();
		System.out.println("Cycle ride()");
	}
}

class Unicycle extends Cycle {
	public Unicycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Unicycle()");
	}
	public void start() {
		System.out.println("Unicycle start()");
	}
}

class Bicycle extends Cycle {
	public Bicycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle()");
	}
}

class Tricycle extends Cycle {
	public Tricycle() {
		// TODO Auto-generated constructor stub
		System.out.println("Tricycle()");
	}
}