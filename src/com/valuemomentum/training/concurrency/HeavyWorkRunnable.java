package com.valuemomentum.training.concurrency;

public class HeavyWorkRunnable implements Runnable {
	public void run()
	{
		System.out.println("Doing heavy processing -START" +Thread.currentThread().getName());

			try
			{
				Thread.sleep(1000);
				doDBProcessing();
				
				
			}
			catch(InterruptedException e)
			{
				System.out.println("Doing heavy processing" +Thread.currentThread().getName());
			}
			
	}

	private void doDBProcessing() throws InterruptedException {
		Thread.sleep(5000);
		
		
	}

}	
	

			
		
	
	


