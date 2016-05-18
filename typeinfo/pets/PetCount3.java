package typeinfo.pets;
import java.util.*;

public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
		public PetCounter() {
			put(Pet.class, 0);
			put(Dog.class, 0);
			put(Cat.class, 0);
			put(Rodent.class, 0);
			put(Mutt.class, 0);
			put(Pug.class, 0);
			put(EgyptianMau.class, 0);
			put(Manx.class, 0);
			put(Cymric.class, 0);
			put(Rat.class, 0);
			put(Mouse.class, 0);
			put(Hamster.class, 0);
		}
		public void count(Pet pet) {
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				// 动态的instanceof     isInstance(Object)
				if(pair.getKey().isInstance(pet)) {
					put(pair.getKey(), pair.getValue()+1);
				}
			}
		}
		public String toString() {
			StringBuilder result = new StringBuilder("{");
			for(Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			result.delete(result.length()-2, result.length());
			result.append("}");
			return result.toString();
		}
	}

	public static void main(String[] args) {
		PetCounter petCount = new PetCounter();
		for(Pet pet : Pets.createArray(20)) {
			System.out.print(pet.getClass().getSimpleName() + " ");
			petCount.count(pet);
		}
		System.out.println();
		System.out.println();
		System.out.println(petCount);
	}
}
