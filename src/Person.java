import java.util.Scanner;
public class Person {
    private String name;
    private int age;
    private String constituency;
    Scanner s;
    
    Person()
    {
    	System.out.println();
    	age=0;
    	name=" ";
    	constituency="Bengaluru";
    			s=new Scanner(System.in);
    }
    
    
    Person(String n,int a) //parametirized
    {
    name=n;
    age=a;
    }
    
    
    public void input()
    {
    	System.out.println("enter your name");
    	name=s.next();
    	System.out.println("enter your age");
    	age=s.nextInt();
    }
    
    public void print()
    {
    	System.out.println("name is"  + name);
    	System.out.println("Age  is"  + age);
    	System.out.println("Constituecy is"  +  constituency);

    	
    }
    
    
}

    
