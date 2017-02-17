package learningCollection;

import java.util.HashSet;
import java.util.Set;

public class LearningHashSet {

	public static void main(String[] args) {
		Set<String > Set = new HashSet<String>();
		Set.add("User1");
		Set.add("User2");
		Set.add("User3");
		Set.add("User4");
		
		System.out.println(Set.size());
		for (String string : Set) {
			System.out.println(string);
		}
	}

}
