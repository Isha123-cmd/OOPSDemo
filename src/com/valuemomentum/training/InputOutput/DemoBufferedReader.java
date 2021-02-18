package com.valuemomentum.training.InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This java example source code demonstrates the use of mark() method of BufferedReader class. Basically we mark the stream and use the reset method to go back to the //marked index.


public class DemoBufferedReader {

	public static void main(String[] args) {
		System.out.print("Enter Characters: ");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// catch the possible IOException by the read() method
		try { 

			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.mark(2);  		 //start printing from 2nd position
			System.out.println("Printing characters after mark");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			reader.reset();  		//printing from the marked position
			System.out.println("Printing characters after reset");
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			System.out.println((char)reader.read());
			// close the BufferedReader object
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//marks and reset should be used hand in hand and not alone 