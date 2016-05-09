package chp8.shape;
import java.util.Random;

public class RandomShapeGenerator {
	private Random rand = new Random();
	public Shape next() {
		switch(rand.nextInt(3)) {
		case 0: return new Circle();
		case 1: return new Square();
		case 2: return new Triangle();
		default: break;
		}
		return null;
	}
}
