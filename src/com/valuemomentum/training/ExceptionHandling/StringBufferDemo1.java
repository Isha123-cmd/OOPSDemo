package com.valuemomentum.training.ExceptionHandling;

public class StringBufferDemo1 {

	public static void main(String[] args) {
         StringBuffer str = new StringBuffer("JamesGosling"); //12
         int l=str.length();
         
         System.out.println("Length of String is :" +l);
         
         
         //12+16 when we put something in string it gives extra 16 char  space after that string
         System.out.println("The Capacity of the string :"  +str.capacity());
         
        // System.out.println("The reverse String is : " + str.reverse());

         System.out.println("The substring :" +str.substring(0,5));  //fetching specific from 0 to lenght -1
         
         str.replace(5, 10, "Java");
         System.out.println(str);
         
         str.delete(2, 5);
         System.out.println(str);
	}

}

//initially empty string contain contain 16 char.
//when we add something again 16 are added after that 
