package learningCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		Set<String > Set = new TreeSet<String>();
		Set.add("User1");
		Set.add("User2");
		Set.add("User3");
		Set.add("User4");
		
		/*System.out.println(Set.size());
		for (String string : Set) {
			System.out.println(string);
		}*/
		
		
		Iterator<String> it = Set.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
		
	}

}
