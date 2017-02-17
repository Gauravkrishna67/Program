package learningCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class LearningArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		System.out.println(list.size());
		for (String string : list) {
			System.out.println(string);
		}
		
		/*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
		
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()){
		System.out.println(it.next());
		}*/
	}

}
