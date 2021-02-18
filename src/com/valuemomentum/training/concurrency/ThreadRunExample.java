package com.valuemomentum.training.concurrency;

public class ThreadRunExample {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new HeavyWorkRunnable(), "t1-isha");
		Thread t2= new Thread(new HeavyWorkRunnable(), "t2-syaani");
		System.out.println("Starting the runnable threads");
		t1.start(); //invoke run method
		t2.start();
		System.out.println("Runnable threads have startd");
	
		Thread t3=new MyThread2("t3");
		Thread t4=new MyThread2("t4");
		System.out.println("starting mythreads");
		t3.start();
		t4.start();
		System.out.println("Mythreads has been started");
	}

}
