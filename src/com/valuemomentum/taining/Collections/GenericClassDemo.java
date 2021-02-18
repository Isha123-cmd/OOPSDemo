package com.valuemomentum.taining.Collections;


class Sample<T>   //generic class
{
	
	private T data;
	
	
 
	    public Sample(T data) {
		super();
		this.data = data;
	}
		//output
	public T getData() {    
		return data;
	}
           //input
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
}
public class GenericClassDemo {

	public static void main(String[] args) {

		 Sample<Integer> s1=new Sample<Integer>(10);  //creating object of generic class
		// s1.setData(15);
		 System.out.println("displaying from generic class of type integer"   +s1.getData());
		 
		
		 
		 Sample<String> s2=new Sample<String>("java generics");  //creating object of generic class
		// s2.setData("Java Generics");
		 System.out.println("displaying generic class of type String"+ " "    +s2.getData());
	
		 Sample<Float> s3=new Sample<Float>(120.35f);  //creating object of generic class
		// s3.setData(152.35f);
		 System.out.println("displaying generic clas of type float"    +s3.getData());
	}

}


//jis type ka object banayenge wo type ka T hoga
//when there is constructot no need of set data,values are given directly