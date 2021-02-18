package com.valuemomentum.taining.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student5> ar=new ArrayList<Student5>();
		
		Student5 s1=new Student5(111,"John","Bengaluru");
		Student5 s2=new Student5(121,"Allan","Mumbai");
		Student5 s3=new Student5(101,"Mike","Newyork");
		Student5 s4=new Student5(115,"Sam","Milan");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println("**********Unsorted Array List:************");
		//System.out.println(ar); // invoke toString() method
		for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortByRoll());
		
		System.out.println("**********Sorted Array List by Roll No:**********");
				for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

		Collections.sort(ar, new SortByName());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
	}

}

		
	

