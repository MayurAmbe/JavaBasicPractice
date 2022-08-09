package JavaBasic;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int i=300;
		int j=400;
		int k=40000;
		
		if(i>j & i>k) {
			System.out.println("i is greter number");
		}
		
		else if (j>k) {
			System.out.println("j is greter number");
		}
		else {
			System.out.println("k is greter number");
		}
		
		
		
		int p=20;
		int q=20;
		int r=20;
		
		if (p==q) {
			System.out.println("p is equal to q");
		}
		else {
			System.out.println("p is not equal to q");
		}
		
		String s="mayu";
		String s1="mayur";
		if (s==s1){
			System.out.println("spell is correct");
		}
		else {
			System.out.println("spell is wrong");
		}
		
		int a=35;
		int b=50;
		int c=75;
		int d=90;
		int f=100;
		int e=0;

		int x=15;
		
		String m="Mayur";
	
		if (a>=e) {
			System.out.println("result is fail");
		}
		else if (b>=a) {
			System.out.println("result is just pass");
		}
		else if(c>=b) {
			System.out.println("result is pass");
			
		}
		else  if (d>=c) {
			System.out.println("result is passs with distigntion");
		}
		else if (f>=d) {
			System.out.println("result is superb");
		}
		
	}

}
