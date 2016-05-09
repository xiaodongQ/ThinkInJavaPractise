package chp6.permission;
import static myutil.Print.*;
import chp6.permission.subpack.*;

public class TestProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("English");
		print(b.getDesc());
		/*包访问权限*/
//		b.setDesc("Chinese");
		print(b.getDesc());

	}

}
