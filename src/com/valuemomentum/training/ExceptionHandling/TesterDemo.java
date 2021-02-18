package com.valuemomentum.training.ExceptionHandling;
class Tester {
	int eid;
	String name;
	float sal;
	public Tester(int eid, String name, float sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	//@Override
	//public String toString() {
	//	return "Tester [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
//	}	
}
public class TesterDemo {
	
	public static void main(String[] args) {
		Tester t1= new Tester(101,"'isha", 2000.00f);
		
		//System.out.println(t1); //invoke toString Method
		
		System.out.println(t1.eid + "  " +t1.name+ " " +t1.sal);

	}

}
