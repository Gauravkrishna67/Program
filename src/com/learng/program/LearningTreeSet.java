package com.learng.program;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LearningTreeSet {

	public static void main(String[] args) {
		Set<String> set =new TreeSet<String>();
		set.add("my");
		set.add("name");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		/*for (String string : set) {
			System.out.println(string);
		}*/
	}

}
