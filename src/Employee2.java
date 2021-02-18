
import java.util.Scanner;

 

class Empl{
int salary, workingHr;

 

void getinfo() {


Scanner s=new Scanner(System.in);
System.out.println("Salary and Working hour of employee");

salary=s.nextInt();
workingHr=s.nextInt();


}
void addSal()
{
if(salary<=500)
{
salary=salary+10;
}
}
void addWork()
{
if(workingHr>=6)
{
salary=salary+5;
}

}
void display()
{

 

System.out.println("final salary of employee : "+salary);
System.out.println("Working hour of employee : "+workingHr);


}

 

}

public class Employee2 {

public static void main(String[] args) {
      Empl e1=new Empl();
     e1.getinfo();
      e1.addSal();
     e1.addWork();
     e1.display();

}

 

}