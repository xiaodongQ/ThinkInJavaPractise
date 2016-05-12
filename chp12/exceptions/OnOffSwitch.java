package chp12.exceptions;
import static myutil.Print.*;

import javax.management.RuntimeErrorException;

public class OnOffSwitch {
	private static Switch sw = new Switch();
	public static void f() throws OnOffException1,OnOffException2 {}
	public static void main(String[] args) {
		try {
			sw.on();
			OnOffSwitch.f();
			sw.off();
			throw new RuntimeException();
		} catch(OnOffException1 e) {
			print("OnOffException1");
		} catch(OnOffException2 e) {
			print("OnOffException2");
		} finally {
			print("Finally");
			sw.off();
		}
	}
}

class Switch {
	private boolean state = false;
	public boolean read() {
		return state;
	}
	public void on() {
		state = true;
		print(this);
	}
	public void off() {
		state = false;
		print(this);
	}
	public String toString() {
		return state ? "on" : "off";
	}
}

class OnOffException1 extends Exception {
	
}

class OnOffException2 extends Exception {
	
}