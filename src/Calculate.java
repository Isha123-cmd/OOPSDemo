
public class Calculate 
	{
		void sum ()
		{
			System.out.println("method overloading");
		}
		
		void sum(int a,int b)
		{
			System.out.println("sum is "+(a+b));
		}
		
		void sum(float a, float b)
		{
			System.out.println("concatination is " +(a+b));
		}
	

	public static void main(String[] args) {
		Calculate cal=new Calculate();
		cal.sum();
		cal.sum(8,5);
		cal.sum(9f,5f);
	}

}
