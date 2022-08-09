package OopsConceptPart2;

public class TestCar {
//when same method present in parent class aw well in child class with same argument
	public static void main(String[] args) {
	
		BMW b=new BMW();//overriding method
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		//this is called compile time or static polymorphism
		System.out.println("******");
        Car c=new Car();
        c.start();
        c.stop();
        c.refuel();
        c.engine();
//c.theftsafety(); not allowed ..parent cant access to inherit child class method
        System.out.println("*****");
        
        
        //top casting
        Car c1= new BMW();//child class object can  access with parent class reference variable
        c1.start();
        c1.stop();
        c1.refuel();
       // c1.theftsafety(); not  allowed
        
        System.out.println("******");
        //down casting
       //BMW b1= (BMW)new Car();//down casting not allowed it will give error
        //b1.start();
        
        
	}

}
