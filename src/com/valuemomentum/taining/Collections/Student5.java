package com.valuemomentum.taining.Collections;

import java.util.Comparator;

public class Student5 {
	
	int rollno;
	String name,address;
	public Student5(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	//used to print properties in main when obj is given in sop
	@Override
	public String toString() {
		return "Student5 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
}

class SortByRoll implements Comparator<Student5>
{
	public int compare(Student5 s1, Student5 s2)
	{
		return s1.rollno -s2.rollno;
	}
	}
class SortByName implements Comparator<Student5>
{
	
	
	

	

	@Override
	public int compare(Student5 s1, Student5 s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}
	
	
	

}
