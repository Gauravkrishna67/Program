package com.learng.program;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class LearningRepeatingCharacterInString {
	
	 public static void main(String[] args) {
	 
	/*	String str  = "tapa";
	 
	    Map<Character,Integer> hmap = new HashMap<Character,Integer>();
	    
	     for(char ch : str.toCharArray()){
	    	 
	    	 hmap.put(ch, hmap.containsKey(ch) ? hmap.get(ch)+1 : 1);
	    	 
	     }
	 
	     System.out.println(hmap);*/
		 String str="test";
		 Map<Character,Integer> m = new HashMap<Character,Integer>();
		 for(char ch: str.toCharArray()){
		 m.put(ch, m.containsKey(ch) ? m.get(ch)+1 : 1);
		 }
		 System.out.println(m);
	    /*char[] chars = str.toCharArray();
	 
	    for(Character ch:chars){
	      if(map.containsKey(ch)){
	         map.put(ch, map.get(ch)+1);
	      } else {
	         map.put(ch, 1);
	        }
	    }
	 
	    Set<Character> keys = map.keySet();
	    for(Character ch:keys){
	      if(map.get(ch) > 1){
	        System.out.println("Char "+ch+" "+map.get(ch));
	      }
	    }
	  }
	 
	  public static void main(String a[]){
		  LearningRepeatingCharacterInString obj = new LearningRepeatingCharacterInString();
	    obj.countDupChars("BeginnersBook.com");
	  }*/
	}
}