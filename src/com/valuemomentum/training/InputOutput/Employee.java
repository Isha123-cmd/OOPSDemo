package com.valuemomentum.training.InputOutput;

import java.io.*;
public class Employee implements Serializable {
          
	public String name;
	public String address;
	public transient int SSN; 
	public int number;
	
	public void mailCheck()
	{
		System.out.println("MAiling a check to" + name + " " + address);
	}
}
