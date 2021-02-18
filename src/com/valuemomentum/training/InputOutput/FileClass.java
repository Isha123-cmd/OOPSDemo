package com.valuemomentum.training.InputOutput;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) {
		
		File f=new File("Bye.text");
		
		try {
			
			if (f.createNewFile())
			{
				System.out.println("New file Created");
			}
			else {
				System.out.println("The file already exist");
			}
		}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		System.out.println("new file name" + " " +f.getName());
			}
	         
	         
			
		}
		
	


