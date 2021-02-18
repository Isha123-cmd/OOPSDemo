package com.valuemomentum.training.InputOutput;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		
		try {
			Reader reader=new FileReader("c:/test/data.txt");
			int data=reader.read();  //return ascii value of character
			while(data !=-1)         //-1 when stream end
			{
				System.out.print((char)data);  //converting into char
				data =reader.read();
			}
			reader.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
