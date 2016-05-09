package chp10.innerclass.p1;
import static myutil.Print.*;

class Line {
	private String d = "line";
	private class LineImp implements Shape {
		private String desc = "lineimp";
		public void draw() {
			print("draw()");
		}
		public void erase() {
			print("erase()");
		}
	}
	public Shape getLineImp() {
		return new LineImp();
	}

	public static void main(String[] args) {
		Line l = new Line();
		LineImp s = (LineImp)l.getLineImp();
		s.draw();
		s.erase();
		print(s.desc);
		print(l.d);
	}
}
