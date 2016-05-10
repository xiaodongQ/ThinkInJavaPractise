package chp11.holding;
import chp11.holding.*;
import java.util.*;
import static myutil.Print.*;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Gerbil, Integer> gMap = new HashMap<Gerbil, Integer>();
		gMap.put(new Gerbil("little"), 1);
		gMap.put(new Gerbil("middle"), 2);
		gMap.put(new Gerbil("large"), 3);
		print(gMap.keySet());
		print(gMap.values());
		print(gMap);
		for(Gerbil g : gMap.keySet()) {
			g.hop();
		}
	}

}
