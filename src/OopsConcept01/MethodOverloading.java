package OopsConcept01;

public class MethodOverloading {//when the method name is same with different argument,parameter i.e. zero,one, two

	public static void main(String[] args) {
	
		MethodOverloading obj=new MethodOverloading();//we can overload main method
		
		obj.sum();
		obj.sum(19);
		obj.sum("mayur", " jain");
		
		//same method name same parameter with different data type is allowed
	}

	public void sum() {
		System.out.println("sum method...zero parameter");
	}
	
	public void sum(int x) {
		System.out.println("sum method....one input parameter");
		System.out.println(x);
	}
	
	
	public void sum (String j, String k) {
System.out.println("sum method ...two parameter");	
System.out.println(j+k);
	}

}
