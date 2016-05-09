package chp10.innerclass.p3;

import chp10.innerclass.p1.*;
import chp10.innerclass.p2.Circle;

public class CircleA extends Circle {
	public Shape getCirclePro() {
		return super.getCircleImp();
	}
	public static void main(String[] args) {
		CircleA ca = new CircleA();
//		Shape cs = ca.getCircleImp();
		Shape cs = ca.getCirclePro();
		cs.draw();
		cs.erase();
	}
}
