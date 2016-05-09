package chp11.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Gerbil {
	int gerbilNumber;
	public Gerbil(int i) {
		gerbilNumber = i;
	}
	public void hop() {
		System.out.println("gerbilNumber=" + gerbilNumber + " hop()");
	}
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		for(int i=0; i<5; i++) {
			gerbils.add(new Gerbil(i));
		}
/*		for(Gerbil g : gerbils) {
			g.hop();
		}
*/		Iterator<Gerbil> it = gerbils.iterator();
		while(it.hasNext()) {
			Gerbil g = it.next();
			g.hop();
		}
	}
}
