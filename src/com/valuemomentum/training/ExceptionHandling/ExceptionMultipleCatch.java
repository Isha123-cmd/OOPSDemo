package com.valuemomentum.training.ExceptionHandling;

public class ExceptionMultipleCatch {

	public static void main(String[] args) {
            int num1=10;
            int num2=0;
            int result =0;
            int arr[]=new int[5];
            
            try {
            	arr[0]=0;
            	arr[0]=1;
            	arr[0]=2;
            	arr[0]=3;
            	arr[0]=4;
            	arr[0]=5;
            	
            	result=num1/num2;
            	System.out.println("Result of division:"  +result);
            
            }
            catch(ArithmeticException e)
            {
            	System.out.println("Err : Divided by zero" );
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
            	System.out.println("Err :Array Out of bound");
            }
            
            catch(Exception e)
            {
            	e.printStackTrace();
            }
	}
}

