package com.valuemomentum.training.concurrency;


class First
{
	//only one thread at a time when we use synchronize
synchronized public void display(String msg)
	{
		System.out.print("[" +msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
	}

  class Second extends Thread
  {
	  String msg;
	  First fObj;   //aggregation ,reffering object of first class
	public Second(String msg, First fObj) {
		super();
		this.msg = msg;
		this.fObj = fObj;
		start();
		
	}
	  
	  public void run()
	  {
		  fObj.display(msg);  //display is shared method 
	  }
  }
public class SynchronizeDemo {

	public static void main(String[] args) {
		
		First f1=new First();
		Second s1=new Second("welcome",f1);
		Second s2=new Second("java",f1);
		Second s3=new Second("programmer",f1);
	}

}
