package com.valuemomentum.taining.Collections;


import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
				
	HashMap<Integer,String> languages=new HashMap<>();
	   languages.put(1,"java");
	   languages.put(2,"python");

	   languages.put(3,"Javascript");
	   System.out.println("hashmap:" + languages);
	   
	   //get() method to get value
	   String value=languages.get(1);
	   System.out.println("value at index1: "+value);
	   		System.out.println("values at index 1: " +languages.get(3));
	   		
	   		
	   	//return set view of keys
	   		System.out.println("keys: "  +languages.keySet());
	   		
	   		//return set view of values
	   		System.out.println("values: "  +languages.values());
	   		
	   		//return set view pf ker/value pairs
	   		System.out.println("key/values: "  +languages.entrySet());

	   		languages.replace(2, "C++");
	   		
	   		//iterate through keys only
	   		System.out.println("Keys: ");
	   		
	   		for(Integer key : languages.keySet())
	   		{
	   			System.out.print(key +" - " + languages.get(key));
	   			System.out.print(" , ");
	   			
	   		}
	   		
	   	 // iterate through key/value entries
	   	    System.out.print("\nEntries: ");
	   	    for (Entry<Integer, String> entry : languages.entrySet()) {
	   	      System.out.print(entry);
	   	      System.out.print(", ");
	   	    }


	
	}

}
