package com.valuemomentum.training.ExceptionHandling;

public class ThrowDemo {
	
	public static void hello()
	{
		
		throw new ArithmeticException("Testing Exception");
		
	}

	public static void main(String[] args) {
           hello();
	}

}
