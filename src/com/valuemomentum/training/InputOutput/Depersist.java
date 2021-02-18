package com.valuemomentum.training.InputOutput;
import java.io.*;
public class Depersist {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("c:/test/f.txt"));
		Students s=(Students)in.readObject();
		System.out.println(s.id+ " "+s.name);
		
		in.close();
	}

}
