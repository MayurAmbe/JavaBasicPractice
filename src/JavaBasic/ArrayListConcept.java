package JavaBasic;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ab= new ArrayList();
		
		ab.add(100);
		ab.add(200);
		ab.add(300);
		ab.add(400);
	
		
		System.out.println(ab.get(0));
		System.out.println(ab.get(3));
		System.out.println(ab.get(2));
		
		ab.add("mayur");
		System.out.println(ab.get(4));
		ab.add('^');
		System.out.println(ab.get(5));
		System.out.println(ab.size());
		ab.remove(1);
		System.out.println(ab.get(1));
		System.out.println(ab.size());
		
		for(int k=0;k<ab.size();k++) {
			System.out.println(ab.get(k));
		}
		
		
		ArrayList<Integer> cd =new ArrayList<Integer>();
		
		cd.add(300);
		cd.add(7889);
		System.out.println(cd.get(1));
		System.out.println(cd.get(0));
		
		System.out.println("*****");
		for(int h=0;h<cd.size();h++) {
			System.out.println(cd.get(h));
			
			
			
		}
		
		
		
		
		
		
	}	
	

}
