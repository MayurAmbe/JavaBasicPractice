package OopsConcept01;

public class GlobleVsLocalVariable {

	String name="tom";//globle or class variable
	int age=100;
	
	public static void main(String[] args) {
		GlobleVsLocalVariable w=new GlobleVsLocalVariable();
		w.sum();
		System.out.println(w.name);
		System.out.println(w.age);
		
		int i=10;
		int age=25;
		
		System.out.println(i);
		}
	
	public void sum() {
		int m=20;
		int n=30;
		int age=25;
		int i=10;
		System.out.println("mayur jain");
	}
	
	
	

}
