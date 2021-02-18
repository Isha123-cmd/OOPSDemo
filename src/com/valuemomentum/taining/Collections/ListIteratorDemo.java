package com.valuemomentum.taining.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String>al = new ArrayList<String>();
		
		al.add("Jim");
		al.add("Jerry");

		al.add("John");
		al.add(1,"jive");
		
		System.out.println("element at 2nd position:" +al.get(2));

		ListIterator<String>itr=al.listIterator();
	
		System.out.println("traversing in forward direction");
		
		while(itr.hasNext())
		{System.out.println(itr.next());}
		
		System.out.println("traversing in backward direction");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		
		
	}

}
