package chp11.holding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Gerbil {
	int gerbilNumber;
	String desc = "init";
	public Gerbil(int i, String desc) {
		gerbilNumber = i;
		this.desc = desc;
	}
	public Gerbil(String desc) {
		this.desc = desc;
	}
	public void hop() {
		System.out.println("gerbilNumber=" + gerbilNumber + " " + desc);
	}
	public String toString() {
		return desc;
	}
	public static void main(String[] args) {
		ArrayList<Gerbil> gerbils = new ArrayList<>();
		for(int i=0; i<5; i++) {
			gerbils.add(new Gerbil(i, ""));
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
