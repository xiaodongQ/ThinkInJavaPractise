package chp6.permission;
import static myutil.Print.*;

public class TestConnectionManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectionManage connMan = new ConnectionManage();
		for(int i=0; i<10; i++) {
			if(connMan.getConnection(true) == null) {
				print("err");
				return;
			}
		}
	}

}
