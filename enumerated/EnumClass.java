package enumerated;
import static myutil.Print.*;

enum Shrubbery {
	GROUND,
	CRAWLING,
	HANGING
}
public class EnumClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Shrubbery s : Shrubbery.values()) {

			print(s + " ordinal: " + s.ordinal());
			printnb(s.compareTo(Shrubbery.CRAWLING) + " ");
			printnb(s.equals(Shrubbery.CRAWLING) + " ");
			print(s == Shrubbery.CRAWLING);
			print(s.getDeclaringClass());
			print(s.name());
			print("------------------------");
		}
		for(String s : "HANGING CRAWLING GROUND".split(" ")) {
			Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
			print(shrub);
		}
	}

}
