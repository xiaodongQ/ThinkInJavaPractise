package chp9.interfaces.music5;
import static myutil.Print.*;

public class Music5 {
	static void tune(Playable i) {
		i.play(6);
	}
	static void tuneAll(Instrument[] e) {
		for(Playable i : e) {
			tune(i);
		}
	}
	public static void main(String[] args) {
		Instrument[] orchestra = {
				new Wind(),
				new Percussion(),
				new Stringed(),
				new Brass(),
				new Woodwind()
		};
		tuneAll(orchestra);
	}

}

abstract class Instrument implements Playable {
	int VALUE = 5;
	//将play分离到接口，然后本抽象类实现接口
//	abstract void play(int i);
	abstract void adjust();
}

interface Playable {
	void play(int i);
}

class Wind extends Instrument implements Playable {
	public void play(int i) {
		print(this + ".play() " + i);
	}
	public void adjust() {
		print(this + ".adjuse()");
	}
	public String toString() {
		return "Wind";
	}
}

class Percussion extends Instrument implements Playable {
	public void play(int i) {
		print(this + ".play() " + i);
	}
	public void adjust() {
		print(this + ".adjuse()");
	}
	public String toString() {
		return "Percussion";
	}
}

class Stringed extends Instrument implements Playable {
	public void play(int i) {
		print(this + ".play() " + i);
	}
	public void adjust() {
		print(this + ".adjuse()");
	}
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}