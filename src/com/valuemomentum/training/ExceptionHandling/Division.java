package com.valuemomentum.training.ExceptionHandling;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
       int a,b,result;
       Scanner input= new Scanner (System.in);
       System.out.println("input two numbers");
       a=input.nextInt();
       b=input.nextInt();
       
       try {
       result=a/b;
       System.out.println("Result =" +result);
	 }
       
       catch(ArithmeticException e)
       {
    	   System.out.println("exception caught: Division by zero");
       }
       finally {
    	   input.close();
    	   System.out.println("In finally block");
       }
       
       }

}
