package chp8.shape;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[9];
		for(int i=0; i<s.length-1; i++) {
			s[i] = gen.next();
		}
		s[8] = new Circle();
		for(Shape shp : s) {
			shp.draw();
			shp.show();
		}
		// 向下转型
		((Circle)s[8]).roll();


	}

}
