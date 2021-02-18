
abstract class Shape
{
	String objectName= " ";
	Shape(String name)
	{
		this.objectName=name;
	}
	
	public void moveTo(int x,int y)
	{
		System.out.println(this.objectName + " " + "has been move to" + " x =" +x+" and y =" +y);
	}
	
	//abstract method will be implemented in the subclass
	    abstract public double area();
	    abstract public void draw();
	}
         class Rectangle extends Shape
         {
        	 int length, width;
        	 Rectangle(int length,int width, String name)
        	 {

        		 super(name);
        		 this.length=length;
        		 this.width=width;
        	 }
         
         
         public void draw()
         {
        	 System.out.println("rectangle has been drawn");
         }
         
         public double area()
         {
        	 return (double)(length*width);
         }
         }
         
         class Circle extends Shape
         {
        	 double pi=3.14;
        	 int radius;
        	 
        	 Circle(int radius,String name)
        	 {
        		 super(name);
        		 this.radius=radius;
        	 }
         
         
         public void draw()
         {
        	 System.out.println("circle has been drawn");
         }
             public double area()
             {
            	 return(double)((pi*radius)/2);
             }
         }
         
public class AbstractDemo1 {

	public static void main(String[] args) {
      
		//creating the object of rectangle class and using shaoe class reference
	 
		Shape rect= new Rectangle(2,3,"Rectangle");
		System.out.println("area of rectangle :"  +rect.area());
		rect.moveTo(1, 2);
		System.out.println(" ");
		
		//creating object of circle
		Shape circle=new Circle (2, "Circle");
		           circle.draw();
		System.out.println("area of circcle is :" +circle.area());
		circle.moveTo(2, 4);
	}
		

	}


