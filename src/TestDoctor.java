
public class TestDoctor {

	public static void main(String[] args) {
        
		Specialist spObj= new Specialist("Mary" , 1234, "new Delhi", "Medicine");
		spObj.display();
		
		NonSpecialist nonSObj = new NonSpecialist ("John",321,"New York");
		nonSObj.display();  
	}

}
