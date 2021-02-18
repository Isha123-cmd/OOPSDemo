package com.valuemomentum.training.concurrency;


class Test extends Thread
{
	public void run()
	{
		//every thread has id and id is getting printed
		System.out.println("Thread" + " " +Thread.currentThread().getId() + " " + "is running");
	}
	}
public class MultiThreadDemo {
	
	public static void main(String[] args) {
		
		int n=8; //no of threads
		
		for(int i=1;i<=n;i++)
		{
			Test t=new Test();
			t.start();
		}
	}

}
