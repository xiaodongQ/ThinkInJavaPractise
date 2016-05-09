package chp8;
import static myutil.Print.*;

public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
		new RectangularGlyph("xd", 1992);
	}

}

class Glyph {
	void draw() {
		print("Glyph.draw()");
	}
	Glyph() {
		print("Glyph() before draw()");
		draw(); // 此时调用的是子类覆盖后的方法，但子类并未完成构造，初始化为零值0/null/false
		print("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		print("RoundGlyph.RoundGlyph, radius= " + radius);
	}
	void draw() {
		print("RoundGlyph.draw(), radius= " + radius);
	}
}

class RectangularGlyph extends Glyph {
	private String s = "hello";
	private int i = 3;
	public RectangularGlyph(String s, int i) {
		// TODO Auto-generated constructor stub
		this.s = s;
		this.i = i;
		print("RectangularGlyph() " + "s is " + s + ",i is " + i);
	}
	void draw() {
		print("RectangularGlyph.draw() " + "s is " + s + ",i is " + i);
	}
	
}