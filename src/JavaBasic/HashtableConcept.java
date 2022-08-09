package JavaBasic;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
       h.put(1, 50);
       h.put(89, 1000);
       h.put(7647, 786);
       h.put(100, 6000);
       h.put("m", "mayur");
       System.out.println(h.get(89));
       System.out.println(h.get(7647));
       System.out.println(h.get("m"));
       System.out.println(h.size());
       
      
		

	}

}
