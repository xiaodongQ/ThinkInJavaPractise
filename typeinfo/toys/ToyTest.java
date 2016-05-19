package typeinfo.toys;
import static myutil.Print.*;
import java.lang.reflect.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Cars {}

class Toy {
	//newInstance需要默认构造器
//	Toy() {}
	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Cars {
	FancyToy() {
		super(1);
	}
}

public class ToyTest {
	static void printInfo(Class cc) {
		print("Class name: " + cc.getName() +
				", is interface? [" + cc.isInterface() + "]");
		print("Simple name: " + cc.getSimpleName());
		print("Canonical name: " + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = null;
		try {
			c = Class.forName("typeinfo.toys.FancyToy");
		} catch(ClassNotFoundException e) {
			print("Can't find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// 使用newInstance()来创建的类必须带有默认的构造器
			obj = up.newInstance();
			
		} catch(InstantiationException e) {
			print("Can't instantiate");
			System.exit(1);
		} catch(IllegalAccessException e) {
			print("Can't access");
			System.exit(1);
		}
	}

}
