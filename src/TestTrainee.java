import java.util.Scanner;
 
//instance class

class Trainee         //Class Declaration
{
	int tId;         //Properties
	String tName;
	String technology;
	float salary, stipend;
	
	//defining the methods
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter id,name,technology,salary of a trainee");
		tId=s.nextInt();
		tName=s.next();
		technology=s.next();
		salary=s.nextFloat();
	}
	
	float calculate()
	{
		stipend=salary-200;
		return stipend;
		
	}
	
	
	void display()
	{
		System.out.println("******TRainee Details***");
		System.out.println(" TRainee Id   :" +tId);
		System.out.println(" TRainee Name   :" +tName);
		System.out.println(" TRainee Technology   :" +technology);
		//System.out.println(" TRainee Stipend   :" +salary);
	}


		
		
	}
	
	
public class TestTrainee {

	public static void main(String[] args) {
		Trainee t1=new Trainee();       //object defination
		t1.input();	//method call
		
		Trainee t2=new Trainee();
		t2.input();
		
		float s1=t1.calculate();
		float s2=t2.calculate();
		
		t1.display();
		System.out.println(" Stipend   :" +s1);  //returning to the main
		
		t2.display();
		System.out.println(" Stipend   :" +s2);
		
		

	}
}
