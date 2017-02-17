package learningCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LearningHashMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Test1");
		map.put("Occupasion", "Tester");
		System.out.println(map.size());
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String key = (it.next());
			String value = map.get(key);
			System.out.println(key+"-------"+value);
		}
	}

}
