package com.valuemomentum.training.concurrency;

class Count extends Thread 
{
   Count()
   {
     super("my extending thread");
     System.out.println("my thread created" + this); //thid invokes current objecr cnt so it runs first
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
           System.out.println("Printing the count " + i);
           Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("my thread interrupted");
     }
     System.out.println("My thread run is over" );
   }
}
class ImplimentingExample
{
   public static void main(String args[])
   {
      Count cnt = new Count();  //invoke constructor of count another method for initializing
      try
      {
         while(cnt.isAlive())
         {
           System.out.println("Main thread will be alive till the child thread is live");
           Thread.sleep(1500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread interrupted");
      }
      System.out.println("Main thread's run is over" );
   }
}