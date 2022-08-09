package JavaBasic;

public class TwoDimentionArrayConcept {

	public static void main(String[] args) {
		
		String [][]i=new String[3][3];
		
		i[0][0]="mayur";
		i[0][1]="is";
		i[0][2]="GameEndOver";
		
		i[1][0]="i";
		i[1][1]=" love";
		i[1][2]=" dimpi";

		i[2][0]="hellow";
		i[2][1]="world";
		i[2][2]="specious";
		
		System.out.println(i[2][2]);
		System.out.println("******");
		System.out.println(i[1][0]+i[1][1]+i[1][2]);
		System.out.println("*******");
	
		System.out.println(i.length);
	    System.out.println(i[0].length);
		
		//for printing value of all two dimension array use two for loop
	    
	    for(int h=0;h<i.length;h++) {
		for(int k=0;k<i[0].length;k++) {
		System.out.println(i[h][k]);
		}
	    }
		System.out.println("*****");
	    for(int row=0;row<i.length;row++) {
	    	for(int col=0;col<i[0].length;col++){
	    		System.out.println(i[row][col]);
	    	}
	    }
	    
	    
	    
	    
	    
	    
	    
	}

}
