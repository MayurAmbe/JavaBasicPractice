package OopsConcept01;

public class FunctionInJava {

	public static void main(String[] args) {//main method is starting point of execution
		FunctionInJava p= new FunctionInJava();

      p.test();
      int z=p.division(100, 10);
      System.out.println(z);
      String s1=p.qa();
      System.out.println(s1);
      int s=p.sum();
      System.out.println(s);
      
 
		}

       //function and method is same 

		//Function are like factory
		
		//non static method
	public void test() { //void means does not return value...(no input-no output)
		System.out.println("test method");
	}
	
	public int sum() {
		System.out.println("sum method");//(no input-some output)
		
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
	}
	
	public String qa() {
		
		System.out.println("qa method");
		
		String s="selenium";
		
		return s;//return type is String
	}
	
	
	public int division (int x,int y){ //x,y are input parameter
		System.out.println("division method");
		int d=x/y;
		return d;
		//return type is int
		
	}
	
}
	
	

	
	 

	
	
	
	
	
