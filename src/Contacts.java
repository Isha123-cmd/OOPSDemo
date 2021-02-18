
public class Contacts {
	
	void createContact(String name,int no)
	{
		System.out.println("name is "+name+   " number is " +no);
	}
	
	void createContact(String name,int no, long number)
	{
		System.out.println("name is " +name+  "  number is " +no+ " another no " +number);

	}
	public static void main(String[] args) {
		Contacts c=new Contacts();
		c.createContact("Isha", 222);
		c.createContact("ABC", 222, 9087654321L);

		
	}


}
