package chp6.permission;
import static myutil.Print.*;


public class ConnectionManage {

	private static Connection[] connArray;
	private static int count=0;
	public Connection getConnection(boolean b) {
		print(count);
		if(count >= 5) {
			print("no more avaliable Connection");
			return null;
		}
		count++;
		return Connection.makeConnection(b);
	}
	
	public static int getCount() {
		return count;
	}
}

class Connection {
	boolean status=true;
	private Connection() {}
	private Connection(boolean b) {
		status = b;
	}
	public static Connection makeConnection(boolean b) {
		return new Connection(b);
	}
}