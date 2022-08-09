package OopsConcept01;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s ="100";
		System.out.println(s+20);
		
		int x=Integer.parseInt(s);//Integer.parseInt
		System.out.println(x+20);
		
		String k="10.22";
		double a=Double.parseDouble(k);
		System.out.println(a);
		
		String f="true";
		boolean d=Boolean.parseBoolean(f);
		System.out.println(d);
		
		int j=100;
	String c=	String.valueOf(j);//String.valueof
	System.out.println(c+20);
	
	     String w="100a";
	  // int l=  Integer.parseInt(w);
	   //System.out.println(l);//java.lang.NumberFormatException:error occure
		
		
		
		
	}

}
