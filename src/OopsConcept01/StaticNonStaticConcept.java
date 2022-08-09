package OopsConcept01;

public class StaticNonStaticConcept {

	
	String s="tom";
	static int age=25;
	
	public static void main(String[] args) {
		
		//1.static method can call by direct calling
		//2. static method can call by class name also
		sendmail();
		StaticNonStaticConcept.sendmail();
		
		//1. static variable can call directly
		//2. static variable can call by call name
		System.out.println(age);
		System.out.println(StaticNonStaticConcept.age);
		
		StaticNonStaticConcept obj=new StaticNonStaticConcept();
		obj.sum();
		System.out.println(obj.s);
		
		//can i access static method with object  ...yes
		
		obj.sendmail();
		
		
		
		
		
	}
      public static void sendmail() {
    	  System.out.println("sendmail method");
      }
	public void sum() {
		System.out.println("sum...method");
	}
	
	
	
}
