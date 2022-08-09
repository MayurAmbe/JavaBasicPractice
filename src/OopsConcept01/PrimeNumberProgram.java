package OopsConcept01;

public class PrimeNumberProgram {

	public static boolean IsPrimeNumber(int number) {
	
		if ( number <=1) {
			return false;
		}
			
		
		for (int i = 2;i<number;i++) {
			if (number % i==0) {
				return false;
			}
			
		}
		
		return true;
		
	}
		
	
	
	
	public static void main(String[] args) {
		
System.out.println("is this Prime number ;"+IsPrimeNumber(1));
	}

}
