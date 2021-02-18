package com.valuemomentum.training.InputOutput;

import java.io.*;
public class Persist {

	public static void main(String[] args) throws Exception {
         
		Students s1=new Students(101,"isha");
		
		FileOutputStream fout =new FileOutputStream("c:/test/f.txt");   //creating a file serialization
		ObjectOutputStream out=new  ObjectOutputStream(fout);       //wrapping the file
		
		out.writeObject(s1);    //saving the state of an object
		out.flush();
		System.out.println("Success");
	}

}
