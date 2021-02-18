package com.valuemomentum.training.InputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.name="Isha";
		e.address="Csatle Street,Akola";
		e.SSN=11223344;
		e.number=101;
		try
		{
			FileOutputStream fileout=new FileOutputStream("c:/test/employee.ser");  //write in byte format
			ObjectOutputStream out =new ObjectOutputStream(fileout);    //reads the object
			out.writeObject(e);
			out.close();
			fileout.close();
			
			System.out.println("Serialized data is save in c:/test/employee.ser");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}

}
