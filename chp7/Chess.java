package chp7;
import static myutil.Print.*;

public class Chess extends Game {
	Chess() {
		super(1); //若没有显式调用基类构造器，则调用的是基类的默认构造器，现基类无默认构造器
		print("Chess Constructor");
	}
	Chess(int i) {
		super(1);
		print("Chess Constructor Chess(int i)");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess();
	}

}

class Game {
	Game(int i) {
		print("Game Constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i); //第一件事就是调用基类的构造器
		print("BoardGame Constructor");
	}
}
