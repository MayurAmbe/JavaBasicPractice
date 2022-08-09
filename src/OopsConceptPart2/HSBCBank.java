package OopsConceptPart2;

public class HSBCBank implements USBank,BrazilBank {//its a is a relationship
	
	public void mutualfund() //we achieving multiple inheritance
	{
		System.out.println("BrazilBank...mutualfund");
	}
	
	public void credit() {
		System.out.println("HSBC...credit");
	}
	
	public void debit() {
		System.out.println("HSBC...debit");
	}
	
	public void transfer() {
		System.out.println("HSBC...transfer");
	}

	public void homeloan() {
		System.out.println("HSBC ...homeloan");
	}
	
	
}
