package OopsConcept01;

public class CarClass {

	//globle variable
	int wheel;
	int model;
	
	
	public static void main(String[] args) {
		
		CarClass a=new CarClass();//object variable reference...new car is object
		CarClass b=new CarClass();
		CarClass c=new CarClass();
	
		
		//copy of globle variable given to each object

		a.model=2015;
        a.wheel=4;
        
        b.model=2020;
        b.wheel=4;
        
        c.model=2019;
        c.wheel=4;
        
        System.out.println("before shifting references");
        System.out.println(b.model);
        System.out.println(c.wheel);
        
        System.out.println("******");
        
        System.out.println(a.model);
		
		System.out.println("after shifting");
		
		a=b;
		b=c;
		c=a;
		//shifting of reference variable one to another
		a.model=10;
		System.out.println(a.model);
		System.out.println("*****");
		c.model=20;
		System.out.println("******");
		System.out.println(a.model);
		
		
		
		
		
		
	}

}
