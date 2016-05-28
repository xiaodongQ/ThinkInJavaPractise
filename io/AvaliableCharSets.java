package io;
import java.nio.charset.*;
import java.util.*;
import static myutil.Print.*;

public class AvaliableCharSets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedMap<String,Charset> charSets = Charset.availableCharsets();
		Iterator<String> it = charSets.keySet().iterator();
		while(it.hasNext()) {
			String csName = it.next();
			System.out.print(csName);
			
			Iterator aliases = charSets.get(csName).aliases().iterator();
			if(aliases.hasNext()) {
				System.out.print(": ");
			}
			while(aliases.hasNext()) {
				System.out.print(aliases.next());
				if(aliases.hasNext()) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}

}
