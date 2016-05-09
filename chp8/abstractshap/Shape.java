package chp8.abstractshap;

//class Shape {
abstract class Shape {
	public void draw() {}
	public void erase() {}
	public void show() {
		System.out.println("here is Shape show()");
	}
	public abstract void myprint();
}
