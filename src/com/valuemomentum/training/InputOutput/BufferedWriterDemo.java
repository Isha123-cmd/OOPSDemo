package com.valuemomentum.training.InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo{ 
public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
	
	//creating writer object in append mode
FileWriter writer = new FileWriter("c:/test/names.txt",true); 
BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write("James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
     catch (IOException ioe) { 
      ioe.printStackTrace(); 

}
 } 
}

