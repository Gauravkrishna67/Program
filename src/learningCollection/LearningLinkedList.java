package learningCollection;

import java.util.LinkedList;
import java.util.List;

public class LearningLinkedList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("User1");
		list.add("User2");
		list.add("User3");
		
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}

	}

}
