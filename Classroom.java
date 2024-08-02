package sample;

import java.util.Arrays;
import java.util.Random;

public class Classroom {

	public static void main(String[] args) {
		Random rn = new Random();
	    int [] numbers1 = new int[15];
	    
	    
	    for (int i = 0; i < numbers1.length; i++) {
	    	numbers1[i] = rn.nextInt(50, 100);	    	
	    }
	    
	    int [] num3 = Arrays.copyOfRange(numbers1, 0,numbers1.length * 2);
	    
	    for (int j = numbers1.length; j < num3.length; j++) {
	    	 num3[j] = numbers1[j - numbers1.length] * 2;
	    	
	    }
	    
	    
	    System.out.println(Arrays.toString(num3));
	    
	    
	    
        
		
		 }
		 
       
	}


