package chp9.interfaces.cycle;
import static myutil.Print.*;

public class Cycles {
	public static void CycleRide(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.ride();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleRide(new UnicycleFactory());
		CycleRide(new BicycleFactory());
		CycleRide(new TricycleFactory());
	}

}

interface Cycle {
	public void ride();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	public void ride(){
		print("Unicycle ride()");
	}
}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	public void ride(){
		print("Bicycle ride()");
	}
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

class Tricycle implements Cycle {
	public void ride(){
		print("Tricycle ride()");
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}