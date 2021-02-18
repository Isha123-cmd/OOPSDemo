class Bank{
    int getRateOfInterest() {return 0;}

 

}
class SBI extends Bank{
    int getRateOfInterest() {return 6;}

 

}
class ICICI extends Bank{
    int getRateOfInterest() {return 10;}

 

}
class AXIS extends Bank{
    int getRateOfInterest() {return 12;}

 

}
public class OverrideDemo {
    
    public static void main(String[] args) {
        SBI b=new SBI();
        System.out.println("interest is: "+b.getRateOfInterest());
        ICICI b2=new ICICI();
        System.out.println("Interest of ICICI is: "+b2.getRateOfInterest());
        AXIS b3=new AXIS();
        System.out.println("Interest of AXIS is: "+b3.getRateOfInterest());
        

 

    }
}