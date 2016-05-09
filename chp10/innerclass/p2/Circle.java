package chp10.innerclass.p2;

import chp10.innerclass.p1.*;
import static myutil.Print.*;

public class Circle {
	private String desc;
	Circle(String desc) {
		this.desc = desc;
	}
	public Circle() {
		desc = "any";
	}
	private void showDesc() {
		print("desc is " + desc);
	}
	class CircleInner {
		public void modifyDesc(String d) {
			// 自动拥有对其外围类所有成员的访问权
			desc = d;
		}
		private String innerString = "init";
	}
	public void testCircleInner() {
		CircleInner ci = new CircleInner();
		showDesc();
		ci.modifyDesc("modi");
		showDesc();
	}

	protected class CircleImp implements Shape {
		public void draw() {
			print("Circle draw()");
		}
		public void erase() {
			print("Circle erase()");
		}
	}
	public CircleImp getCircleImp() {
		return new CircleImp();
	}
	
	public static void main(String[] args) {
		Circle c = new Circle("circle");
		c.testCircleInner();
	}
}
