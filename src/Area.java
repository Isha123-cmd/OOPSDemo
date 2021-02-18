
import java.util.Scanner;
public class Area
{
    int length;
    int breadth;
    float result;
   Area()
   {
       System.out.println("This is a Constructor");
   }
   Area(int l, int b){
      length=l;
      breadth=b;
   }
   void input()
   {
       Scanner s =new Scanner(System.in);
       System.out.println("enter length and breadth");
        length=s.nextInt();
        breadth=s.nextInt();
        }
   void  returnArea()
   {
      result=length*breadth;
      System.out.println("Area: " +result);
   }
   public static void main(String[] args)
   {
       Area a =new Area();
       a.input();
       a.returnArea();
   }
   
}