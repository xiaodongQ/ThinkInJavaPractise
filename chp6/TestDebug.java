package chp6;

/* 条件编译 */
import chp6.debug.*;
//import chp6.debugoff.*;

public class TestDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transfer ts = new Transfer();
//		ts.debug();
		ts.debug("test");
	}

}
