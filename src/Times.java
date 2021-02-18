
public class Times {
	
	int hours;
	int min;
	int sec;
	
	public Times(int h, int m, int s)
	{
		hours=h;
		min=m;
		sec=s;
	}
      void add(Times obj2)
      {
    	this.hours+=obj2.hours;
    	this.min+=obj2.min;
    	this.sec+=obj2.sec;
    	  
      }
      void display()
 	 {
 		 System.out.println(this.hours + ": " + this.min + ": " + this.sec);
 	 }
	
	
	
	public static void main(String[] args) {
			 
		Times obj1= new Times(10,20,32);
				Times obj2= new Times(2,23,22);
			
				obj1.add(obj2);  //object passed as an arguments
				System.out.println("the addition of time is : ");
		                 
				obj1.display();
		}

	}


	


