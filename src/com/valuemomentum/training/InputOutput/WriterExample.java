package com.valuemomentum.training.InputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) {
		
	
	
	try
	{
	Writer w= new FileWriter("c:/test/data.txt");
	String content="She sells Sea shells";
	w.write(content);
	w.close();
	System.out.println("Data Written");
	
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}





