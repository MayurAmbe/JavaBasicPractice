package OopsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		//variable value can not  be changed
		
		HSBCBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.homeloan();
		b.transfer();
		
		
	 //child class object can be call by parent interface -reference variable
		 
		   USBank m =new HSBCBank();
		   System.out.println("*****");
		  m.credit();
		  m.debit();
		  m.transfer();
		 
		  
	}
  
	
	
	
}


