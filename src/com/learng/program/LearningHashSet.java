package com.learng.program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearningHashSet {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Hello world");
		set.add("hello1");
		
		Iterator <String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
