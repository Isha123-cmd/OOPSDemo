class Animal{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}

   class Dog extends Animal
   {
	   public void display()
	   {
		   System.out.println("My name is " +name);
	   }
   }




public class AnimalTest {

	public static void main(String[] args) {
		
		Dog labrador=new Dog();  //create object of the sub class
		
		//access the field of superclass
		labrador.name= "Rohu";
		labrador.display( );
		
		labrador.eat();

	}

}
