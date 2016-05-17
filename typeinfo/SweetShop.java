
public class SweetShop {
	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length < 1) {
			System.out.println("input format: Java SweetShop classname");
			System.exit(1);
		}
		System.out.println("inside main");
		try {
			Class.forName(args[0]);
		} catch(ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}

}

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}