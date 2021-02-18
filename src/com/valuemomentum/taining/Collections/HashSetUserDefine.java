package com.valuemomentum.taining.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefine {

	public static void main(String[] args) {				
			
		Set<Employee> empset=new HashSet<Employee>();  //employee is user define
		
		Employee e1=new Employee(100,"John",5000);		//in other we use primitive type int,string etc
		Employee e2=new Employee(100,"abc",7000);
		Employee e3=new Employee(100,"Jimmy",6000);
		Employee e4=new Employee(100,"isha",5000);
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		
		for(Employee e : empset)
		{
			System.out.println(e.id+ " " +e.name+ " " +e.sal);
			
		}
		

	}

}
