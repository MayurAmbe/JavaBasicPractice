package JavaBasic;

public class ArrayConcept {

	public static void main(String[] args) {
       //Array Concept
		
		int i[]= new int[3];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		
		System.out.println(i[0]+i[1]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("******");
		String [] s=new String [3];
		s [0] ="mayur";
		s[1]="is";
		s[2]=" best";
		System.out.println(s[2]);
		System.out.println(s.length);
		
		int q=0;
		
		while(q<s.length) {
		System.out.println(s[q]);	
		q++;
		}
		System.out.println("*******");
		for(int w=0;w<s.length; w++) {
			System.out.println(s[w]);
		}
		System.out.println("******");
		
		//object concept
		 
		Object ob []= new Object [6];
		ob[0]="mayur";
		ob[1]='%';
		ob[2]= 1008;
		ob[3]= 10.22;
		System.out.println(ob[0]+s[2]+ob[2]+ob[3]+i[2]);
		
	
		
		
				
		
		
		
		
		
		
		
		
		
		

	}

}
