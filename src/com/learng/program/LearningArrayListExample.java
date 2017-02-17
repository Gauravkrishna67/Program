package com.learng.program;

import java.util.ArrayList;
import java.util.List;

public class LearningArrayListExample {

	public static void main(String[] args) {
		List <String> obj = new ArrayList<String>();
		obj.add("Ball");
		obj.add("Apple");
		obj.add("Dog");
		obj.add("Ear");
		obj.add("Fan");
		
		System.out.println("Currently the array list has following elements"+ obj);
		
		//adding element in the given index
		obj.add("Hat");
		obj.add("Gun");
		
		System.out.println("Now the list is having following elements" + obj);
		
		//removing the element from the given index
		obj.remove(2);
		obj.remove("Dog");
		
		System.out.println("current array list is:" + obj );
	}

}
