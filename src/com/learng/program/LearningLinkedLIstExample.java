package com.learng.program;

import java.util.LinkedList;

public class LearningLinkedLIstExample {

	public static void main(String[] args) {
		LinkedList<String> li = new LinkedList<String>();
		li.add("Ball");
		li.add("Apple");
		li.add("Dog");
		li.add("Fan");
		li.add("Ear");
		System.out.println("Original contaiant of li:" + li);
		
		//remove first and last elements
		li.remove("Dog");
		li.removeFirst();
		
		System.out.println("containts of li after deletation" + li);
		
		//get and set value
		Object value = li.get(2);
		li.set(2, (String) value + "Changed");
		System.out.println("li after changed: "+li);
		
		
	}

}
