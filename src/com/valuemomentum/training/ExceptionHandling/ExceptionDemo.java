package com.valuemomentum.training.ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		String languages[]= {"C","C++","Java","Pearl"};
	
		try {
			for(int c=1;c<=5;c++)
			{
				System.out.println(languages[c]);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());   //only display messgae
			e.printStackTrace();                 //detail information
		}
	}

}
